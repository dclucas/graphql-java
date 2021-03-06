package graphql.schema;

import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.ExecutionInput;
import graphql.language.AstPrinter;
import graphql.language.OperationDefinition;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import static graphql.introspection.IntrospectionQuery.INTROSPECTION_QUERY;
import static java.util.Objects.requireNonNull;

/**
 * Simple remote retriever that retrieves data using the built-in HTTP client
 */
public class HttpRemoteRetriever<C> {
    private final ObjectMapper mapper = new ObjectMapper();
    private final URL remoteUrl;

    public HttpRemoteRetriever(URL remoteUrl) {
        this.remoteUrl = requireNonNull(remoteUrl);
    }

    public CompletableFuture<Map<String, Object>> queryIntrospectionSchema() {
        return CompletableFuture.completedFuture(queryForJson(out -> {
            try {
                out.write(INTROSPECTION_QUERY.getBytes(Charset.forName("UTF-8")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
    }

    public CompletableFuture<Map<String, Object>> query(OperationDefinition query) {
        return CompletableFuture.completedFuture(queryForJson(out -> {
            try {
                Map<String, String> body = new LinkedHashMap<>();
                String queryString = AstPrinter.printAst(query);
                body.put("query", queryString);
                mapper.writeValue(out, body);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
    }

    private Map<String, Object> queryForJson(Consumer<OutputStream> bodyWriter) {
        try {
            final URLConnection urlConnection = remoteUrl.openConnection();
            if (!(urlConnection instanceof HttpURLConnection)) {
                throw new RuntimeException("Expected an HTTP endpoint");
            }
            final HttpURLConnection connection = (HttpURLConnection) urlConnection;
            try {
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Accept", "application/json");
                connection.setRequestProperty("content-type", "application/json");

                bodyWriter.accept(connection.getOutputStream());
                if (connection.getResponseCode() != 200) {
                    throw new IOException("Failed with HTTP error code: " + connection.getResponseCode());
                }
                return mapper.readerFor(Map.class).readValue(connection.getInputStream());
            } finally {
                connection.disconnect();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

package graphql.schema;


import graphql.PublicApi;
import graphql.language.OperationDefinition;
import graphql.language.SelectionSet;
import graphql.language.ServiceDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@PublicApi
public class RemoteRootQueryDataFetcher implements DataFetcher {

    private final HttpRemoteRetriever<Object> remoteRetriever;
    private ServiceDefinition serviceDefinition;

    public RemoteRootQueryDataFetcher(ServiceDefinition serviceDefinition) {
        this.serviceDefinition = serviceDefinition;
        try {
            this.remoteRetriever = new HttpRemoteRetriever<>(new URL(serviceDefinition.getUrl()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object get(DataFetchingEnvironment environment) {
        OperationDefinition query = new OperationDefinition();
        query.setOperation(OperationDefinition.Operation.QUERY);
        query.setSelectionSet(new SelectionSet(environment.getFields()));
        try {
            Map<String, Object> result = remoteRetriever.query(query).get();
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

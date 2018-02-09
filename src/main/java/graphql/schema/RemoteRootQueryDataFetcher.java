package graphql.schema;


import graphql.PublicApi;
import graphql.analysis.QueryTraversal;
import graphql.language.AstPrinter;
import graphql.language.Document;
import graphql.language.Field;
import graphql.language.FieldDefinition;
import graphql.language.FieldTransformation;
import graphql.language.OperationDefinition;
import graphql.language.SelectionSet;
import graphql.language.ServiceDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        Field field = environment.getFields().get(0);
        OperationDefinition query = createQuery(environment);
        String tmp = AstPrinter.printAst(query);
        try {
            Map<String, Object> result = remoteRetriever.query(query).get();
            Map data = (Map) result.get("data");
            return data.get(field.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private OperationDefinition createQuery(DataFetchingEnvironment environment) {
        OperationDefinition query = new OperationDefinition();
        query.setOperation(OperationDefinition.Operation.QUERY);
        List<Field> copiedFields = environment.getFields().stream().map(Field::deepCopy).collect(Collectors.toList());
        query.setSelectionSet(new SelectionSet(copiedFields));
        Document document = new Document();
        document.getDefinitions().add(query);

        QueryTraversal queryTraversal = new QueryTraversal(environment.getGraphQLSchema(), document,null , environment.getArguments());

        Map<Field,FieldDefinition> fieldsToBeReplaced = new LinkedHashMap<>();

        queryTraversal.visitPreOrder(queryVisitorEnvironment -> {
            FieldDefinition definition = queryVisitorEnvironment.getFieldDefinition().getDefinition();
            FieldTransformation fieldTransformation = definition.getFieldTransformation();
            if (fieldTransformation != null) {
                fieldsToBeReplaced.put(queryVisitorEnvironment.getField(), definition);
            }
        });

        for(Map.Entry<Field, FieldDefinition> toReplace: fieldsToBeReplaced.entrySet()) {
            Field field = toReplace.getKey();
            FieldDefinition fieldDefinition = toReplace.getValue();
            field.setName(fieldDefinition.getName());
            field.setSelectionSet(null);
        }

        return query;
    }
}

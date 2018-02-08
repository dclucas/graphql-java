package graphql.schema;


import graphql.Assert;
import graphql.PublicApi;
import graphql.language.Argument;
import graphql.language.AstPrinter;
import graphql.language.Field;
import graphql.language.FieldDefinition;
import graphql.language.FieldTransformation;
import graphql.language.ObjectTypeDefinition;
import graphql.language.OperationDefinition;
import graphql.language.SelectionSet;
import graphql.language.ServiceDefinition;
import graphql.language.StringValue;
import graphql.language.Type;
import graphql.language.TypeName;
import graphql.validation.ValidationUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static graphql.Assert.assertNotNull;
import static graphql.Assert.assertTrue;

@PublicApi
public class TransformationDataFetcher implements DataFetcher {

    private ServiceDefinition serviceDefinition;

    private ValidationUtil validationUtil = new ValidationUtil();

    public TransformationDataFetcher(ServiceDefinition owner) {
        this.serviceDefinition = owner;
    }

    @Override
    public Object get(DataFetchingEnvironment environment) {
        FieldTransformation fieldTransformation = environment.getFieldDefinition().getDefinition().getFieldTransformation();

        TypeName targetType = validationUtil.getUnmodifiedType(fieldTransformation.getTargetFieldDefinition().getType());
        GraphQLType targetGraphQLType = environment.getGraphQLSchema().getType(targetType.getName());
        assertTrue(targetGraphQLType instanceof ObjectTypeDefinition, "target type must be an Object");

        GraphQLObjectType targetObjectType = (GraphQLObjectType) targetGraphQLType;

        GraphQLFieldDefinition targetIdField = targetObjectType.getFieldDefinition("id");
        assertNotNull(targetIdField, "target object must have an id field");

        ServiceDefinition targetService = targetIdField.getDefinition().getServiceDefinition();

        HttpRemoteRetriever remoteRetriever = new HttpRemoteRetriever(getRemoteUrl(targetService));


        PropertyDataFetcher propertyDataFetcher = new PropertyDataFetcher(environment.getFieldDefinition().getName());
        Object id = propertyDataFetcher.get(environment);
        assertNotNull(id, "id is null");

        // Creating query for fetching by Id
        // Convention: name of Type to lowercase is a valid query by Id
        Field getTypeByIdField = new Field(targetObjectType.getName().toLowerCase());
        getTypeByIdField.getArguments().add(new Argument("id", new StringValue(id.toString())));
        getTypeByIdField.setSelectionSet(new SelectionSet(environment.getFields()));

        OperationDefinition query = new OperationDefinition();
        query.setOperation(OperationDefinition.Operation.QUERY);
        query.setSelectionSet(new SelectionSet(Arrays.asList(getTypeByIdField)));

        System.out.println("query:" + AstPrinter.printAst(query));

        Map<String, Object> result = null;
        try {
            result = (Map<String, Object>) remoteRetriever.query(query).get();
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private URL getRemoteUrl(ServiceDefinition targetService) {
        try {
            return new URL(targetService.getUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


}

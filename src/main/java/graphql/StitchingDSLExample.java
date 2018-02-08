package graphql;

import graphql.language.Document;
import graphql.language.FieldDefinition;
import graphql.language.ObjectTypeDefinition;
import graphql.language.ServiceDefinition;
import graphql.language.TypeDefinition;
import graphql.language.TypeName;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLSchema;
import graphql.schema.RemoteRootQueryDataFetcher;
import graphql.schema.StaticDataFetcher;
import graphql.schema.idl.FieldWiringEnvironment;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.SchemaPrinter;
import graphql.schema.idl.TypeDefinitionRegistry;
import graphql.schema.idl.WiringFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static graphql.schema.idl.RuntimeWiring.newRuntimeWiring;

public class StitchingDSLExample {


    public static class StitchingRuntimeWiring implements WiringFactory {


        @Override
        public boolean providesDataFetcher(FieldWiringEnvironment environment) {
            TypeDefinition parentType = environment.getParentType();
            if (parentType.getName().equals("Query")) {
                return true;
            }
            return false;
        }

        @Override
        public DataFetcher getDataFetcher(FieldWiringEnvironment environment) {
            RemoteRootQueryDataFetcher remoteRootQueryDataFetcher = new RemoteRootQueryDataFetcher(environment.getFieldDefinition().getServiceDefinition());
            return remoteRootQueryDataFetcher;
        }
    }

    private static Document buildDocument() {
        /**
         * service Foo {
         *  type Query {
         *      hello: String
         *  }
         * }
         */
        ServiceDefinition serviceDefinition = new ServiceDefinition("Foo", "https://4r09jwx0k9.lp.gql.zone/graphql");
        ObjectTypeDefinition objectTypeDefinition = new ObjectTypeDefinition("Query");
        FieldDefinition fieldDefinition = new FieldDefinition("hello");
        fieldDefinition.setServiceDefinition(serviceDefinition);
        fieldDefinition.setType(new TypeName("String"));
        objectTypeDefinition.getFieldDefinitions().add(fieldDefinition);
        serviceDefinition.setTypeDefinitions(Collections.singletonList(objectTypeDefinition));
        Document document = new Document();
        document.setDefinitions(Arrays.asList(serviceDefinition));
        return document;
    }


    public static void main(String[] args) throws IOException {

//        String schema = Files.readAllLines(Paths.get("./stitching-dsl.txt")).stream().collect(Collectors.joining());
//
//        SchemaParser schemaParser = new SchemaParser();

        Document document = buildDocument();

        StitchingRuntimeWiring wiringFactory = new StitchingRuntimeWiring();

        SchemaParser schemaParser = new SchemaParser();
        TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.buildRegistry(document);

        RuntimeWiring runtimeWiring = newRuntimeWiring()
                .wiringFactory(wiringFactory)
                .build();

        SchemaGenerator schemaGenerator = new SchemaGenerator();
        GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);

        SchemaPrinter schemaPrinter = new SchemaPrinter();
        String printed = schemaPrinter.print(graphQLSchema);
        System.out.println("schema:" + printed);

        GraphQL build = GraphQL.newGraphQL(graphQLSchema).build();
        ExecutionResult executionResult = build.execute("{hello}");

        System.out.println(executionResult.getData().toString());

    }
}

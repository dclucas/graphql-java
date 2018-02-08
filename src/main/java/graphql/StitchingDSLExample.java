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

    private static Document buildDocument2() {
        /**
         * service Foo1 {
         *  type Query {
         *      hello: String
         *  }
         * }
         * service Foo2 {
         *  type Query {
         *      hello2: String
         *  }
         * }
         */
        ServiceDefinition serviceDefinition1 = new ServiceDefinition("Foo1", "https://4r09jwx0k9.lp.gql.zone/graphql");
        ServiceDefinition serviceDefinition2 = new ServiceDefinition("Foo2", "https://4r09jwx0k9.lp.gql.zone/graphql");

        FieldDefinition fieldDefinition1 = new FieldDefinition("hello");
        fieldDefinition1.setType(new TypeName("String"));
        fieldDefinition1.setServiceDefinition(serviceDefinition1);

        ObjectTypeDefinition objectTypeDefinition1 = new ObjectTypeDefinition("Query");
        objectTypeDefinition1.getFieldDefinitions().add(fieldDefinition1);
        serviceDefinition1.setTypeDefinitions(Collections.singletonList(objectTypeDefinition1));

        FieldDefinition fieldDefinition2 = new FieldDefinition("hello2");
        fieldDefinition2.setType(new TypeName("String"));
        fieldDefinition2.setServiceDefinition(serviceDefinition2);

        ObjectTypeDefinition objectTypeDefinition2 = new ObjectTypeDefinition("Query");
        objectTypeDefinition2.getFieldDefinitions().add(fieldDefinition2);
        serviceDefinition2.setTypeDefinitions(Collections.singletonList(objectTypeDefinition2));

        Document document = new Document();
        document.setDefinitions(Arrays.asList(serviceDefinition1, serviceDefinition2));
        return document;

    }


    public static void main(String[] args) throws IOException {

        SchemaParser schemaParser = new SchemaParser();
        // TODO: comment in  the next two lines when ready
//        String schema = Files.readAllLines(Paths.get("./stitching-dsl.txt")).stream().collect(Collectors.joining());
//        schemaParser.parse(schema);
        // TODO: remove when ready
        Document document = buildDocument2();

        TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.buildRegistry(document);

        StitchingRuntimeWiring wiringFactory = new StitchingRuntimeWiring();
        RuntimeWiring runtimeWiring = newRuntimeWiring()
                .wiringFactory(wiringFactory)
                .build();

        SchemaGenerator schemaGenerator = new SchemaGenerator();
        GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);

        SchemaPrinter schemaPrinter = new SchemaPrinter();
        String printed = schemaPrinter.print(graphQLSchema);
        System.out.println("schema:" + printed);

        GraphQL build = GraphQL.newGraphQL(graphQLSchema).build();

        ExecutionResult executionResult1 = build.execute("{hello}");
        System.out.println(executionResult1.getData().toString());


        ExecutionResult executionResult2 = build.execute("{hello2}");
        System.out.println(executionResult2.getData().toString());



    }
}

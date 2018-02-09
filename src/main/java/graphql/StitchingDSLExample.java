package graphql;

import graphql.language.Document;
import graphql.language.FieldDefinition;
import graphql.language.FieldTransformation;
import graphql.language.InputValueDefinition;
import graphql.language.ListType;
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
import graphql.schema.idl.StitchingRuntimeWiring;
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

    private static Document buildDocument3() {
        /**
         * service User {
         *  type User {
         *      id: ID
         *      name: String
         *  }
         *  type Query {
         *      user(id:ID): User
         *  }
         * }
         * service Posts {
         *  type Post {
         *      id: ID
         *      authorId: ID => author: User
         *  }
         *  type Query {
         *      posts: [Post]
         *  }
         * }
         */
        ServiceDefinition postsService = buildPostsService();
        ServiceDefinition usersService = buildUsersService();
        Document document = new Document();
        document.setDefinitions(Arrays.asList(postsService, usersService));
        return document;

    }

    private static ServiceDefinition buildPostsService() {
        /**
         * service Posts {
         *  type Post {
         *      id: ID
         *      authorId: ID => author: User
         *  }
         *  type Query {
         *      posts: [Post]
         *  }
         * }
         */
        ServiceDefinition serviceDefinition = new ServiceDefinition("Posts", "https://p0rm35pkm0.lp.gql.zone/graphql");
        ObjectTypeDefinition postTypeDefinition = new ObjectTypeDefinition("Post");
        postTypeDefinition.getFieldDefinitions().add(newFieldDefinition(serviceDefinition, "id", "ID"));
        FieldDefinition authorField = newFieldDefinition(serviceDefinition, "authorId", "ID");
        FieldTransformation authorFieldTransformation = new FieldTransformation();
        authorFieldTransformation.setTargetFieldDefinition(newFieldDefinition(serviceDefinition, "author", "User"));
        authorField.setFieldTransformation(authorFieldTransformation);
        postTypeDefinition.getFieldDefinitions().add(authorField);

        ObjectTypeDefinition queryTypeDefinition = new ObjectTypeDefinition("Query");

        FieldDefinition userField = newFieldDefinitionOfListType(serviceDefinition, "posts", "Post");
        queryTypeDefinition.getFieldDefinitions().add(userField);

        serviceDefinition.setTypeDefinitions(Arrays.asList(queryTypeDefinition, postTypeDefinition));
        return serviceDefinition;
    }

    private static ServiceDefinition buildUsersService() {
        /**
         * service User {
         *  type User {
         *      id: ID
         *      name: String
         *  }
         *  type Query {
         *      user(id:ID): User
         *  }
         * }
         */
        ServiceDefinition serviceDefinition = new ServiceDefinition("Users", "https://r9km4x894n.lp.gql.zone/graphql");
        ObjectTypeDefinition userTypeDefinition = new ObjectTypeDefinition("User");
        userTypeDefinition.getFieldDefinitions().add(newFieldDefinition(serviceDefinition, "id", "ID"));
        userTypeDefinition.getFieldDefinitions().add(newFieldDefinition(serviceDefinition, "name", "String"));

        ObjectTypeDefinition queryTypeDefinition = new ObjectTypeDefinition("Query");

        FieldDefinition userField = newFieldDefinition(serviceDefinition, "user", "User");
        InputValueDefinition userFieldInput = new InputValueDefinition("id");
        userFieldInput.setType(new TypeName("ID"));
        userField.getInputValueDefinitions().add(userFieldInput);
        queryTypeDefinition.getFieldDefinitions().add(userField);


        serviceDefinition.setTypeDefinitions(Arrays.asList(queryTypeDefinition, userTypeDefinition));
        return serviceDefinition;
    }

    private static FieldDefinition newFieldDefinition(ServiceDefinition serviceDefinition, String name, String type) {
        FieldDefinition userField = new FieldDefinition(name);
        userField.setServiceDefinition(serviceDefinition);
        userField.setType(new TypeName(type));
        return userField;
    }

    private static FieldDefinition newFieldDefinitionOfListType(ServiceDefinition serviceDefinition, String name, String type) {
        FieldDefinition userField = new FieldDefinition(name);
        userField.setServiceDefinition(serviceDefinition);
        userField.setType(new ListType(new TypeName(type)));
        return userField;
    }

    public static void main(String[] args) throws IOException {

        SchemaParser schemaParser = new SchemaParser();
        // TODO: comment in  the next two lines when ready
        String schema = Files.readAllLines(Paths.get("./stitching-dsl.txt")).stream().collect(Collectors.joining());
        TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.parse(schema);
//        // TODO: remove when ready
//        Document document = buildDocument3();
//        TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.buildRegistry(document);

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
//
        ExecutionResult executionResult1 = build.execute("{posts{id, author {id name}}}");
//        ExecutionResult executionResult1 = build.execute("{hello}");
        System.out.println(executionResult1.getData().toString());


    }
}

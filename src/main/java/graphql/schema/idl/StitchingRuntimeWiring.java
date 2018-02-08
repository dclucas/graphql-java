package graphql.schema.idl;

import graphql.Assert;
import graphql.language.TypeDefinition;
import graphql.schema.DataFetcher;
import graphql.schema.RemoteRootQueryDataFetcher;
import graphql.schema.TransformationDataFetcher;

public class StitchingRuntimeWiring implements WiringFactory {


    @Override
    public boolean providesDataFetcher(FieldWiringEnvironment environment) {
        TypeDefinition parentType = environment.getParentType();
        if (parentType.getName().equals("Query")) {
            return true;
        }
        if (environment.getFieldDefinition().getFieldTransformation() != null) {
            return true;
        }
        return false;
    }

    @Override
    public DataFetcher getDataFetcher(FieldWiringEnvironment environment) {
        if (environment.getParentType().getName().equals("Query")) {
            return new RemoteRootQueryDataFetcher(environment.getFieldDefinition().getServiceDefinition());
        }
        if (environment.getFieldDefinition().getFieldTransformation() != null) {
            return new TransformationDataFetcher(environment.getFieldDefinition().getServiceDefinition());

        }
        return Assert.assertShouldNeverHappen();
    }
}
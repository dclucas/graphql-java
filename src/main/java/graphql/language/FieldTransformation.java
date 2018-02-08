package graphql.language;

import java.util.List;

public class FieldTransformation extends AbstractNode<TypeDefinition> {

    private FieldDefinition targetFieldDefinition;
    // TODO: TargetExpression?


    public FieldDefinition getTargetFieldDefinition() {
        return targetFieldDefinition;
    }

    public void setTargetFieldDefinition(FieldDefinition targetFieldDefinition) {
        this.targetFieldDefinition = targetFieldDefinition;
    }

    @Override
    public List<Node> getChildren() {
        return null;
    }

    @Override
    public boolean isEqualTo(Node node) {
        return false;
    }

    @Override
    public TypeDefinition deepCopy() {
        return null;
    }
}

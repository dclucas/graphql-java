package graphql.language;

import java.util.List;

public class FieldTransformation extends AbstractNode<TypeDefinition> {
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

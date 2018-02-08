package graphql.language;

import java.util.List;

public class ServiceDefinition extends AbstractNode<ServiceDefinition> implements TypeDefinition<ServiceDefinition> {

    private final String name;
    private final String url;
    private List<TypeDefinition<?>> typeDefinitions;


    public ServiceDefinition(String name, String url) {
        this.name = name;
        this.url = url;
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
    public ServiceDefinition deepCopy() {
        return null;
    }


    public String getName() {
        return name;
    }

    @Override
    public List<Directive> getDirectives() {
        return null;
    }

    public String getUrl() {
        return url;
    }

    public List<TypeDefinition<?>> getTypeDefinitions() {
        return typeDefinitions;
    }

    public void setTypeDefinitions(List<TypeDefinition<?>> typeDefinitions) {
        this.typeDefinitions = typeDefinitions;
    }
}

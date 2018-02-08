package graphql.language;

import javax.xml.ws.Service;
import java.util.ArrayList;
import java.util.List;

public class ServiceDefinition extends AbstractNode<ServiceDefinition> implements TypeDefinition<ServiceDefinition>  {

    private final String name;
    private final String url;
    private final List<Directive> directives;

    private List<TypeDefinition<?>> typeDefinitions;

    public ServiceDefinition(String name, String url, List<Directive> directives) {
        this.name = name;
        this.url = url;
        this.directives = directives;
        this.typeDefinitions = new ArrayList<>();
    }

    public ServiceDefinition(String name, String url) {
        this(name, url, new ArrayList<>());
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

    @Override
    public List<Directive> getDirectives() {
        return directives;
    }

    public String getName() {
        return name;
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

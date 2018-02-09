# Lessons learned & conscious constraints

* We defined stitching as the ability to merge multiple underlying GraphQL schemas and resolve queries across them. This carries a number of consequences:
    - The stitcher is not in the business of complex transformations (limiting itself to simple FK expansions and type enrichments)
    - The stitcher works over other GraphQL endpoints (meaning no REST->GQL magic is implemented here)
* Important elements such as tracing and circuit breakers are better left for the underlying structure:
    - most s2s communication elements can be handled by a service mesh or similar
    - some elements (eg: circuit breaking fallbacks) are still relevant at the stitching level and have been considered in the design decisions
* While we expect the underlying elements to provide GraphQL, there is *no* assumption on how it is implemented
    - a good part of the value in stitching is to allow for team autonomy, and assuming a specific lib or stack is used goes against it
* A decision was made to not enforce a given structure for things such as pagination and error format
    - this makes the stitcher simpler and more flexible
* A decision was made that scalars need to be declared at the stitching level as well
    - caveat: no effort is made in the stitcher to make sure scalars are rendered consistently (eg: all DateTimes actually have the same format)

# DSL alternatives

Resulting stitched schema:

```
type Post {
    id: ID!
    title: String
    author: User
}

type User {
    id: ID!
    name: String
    posts: [Post]
}

type Query {
    post(id:ID!) : Post
    posts(authorId:ID) : [Post]
    user(id:ID!): User
    users: [User]
}

```

Post service internal schema:

```
type Post {
    id: ID!
    title: String
    authorId: ID
}


type Query {
    post(id:ID!) : Post
    posts(authorId:ID) : [Post]
}

```

User service internal schema:

```
type User {
    id: ID!
    name: String
}

type Query {
    user(id:ID!): User
    users: [User]
}

```

## Pure SDL

In this approach, no additional input parsing is needed, as the SDL contains all the stitching info.

Pros:
* Pure SDL makes it simpler to implement (other stacks can easily onboard this approach)
* No need to learn a new DSL: SDL is a well-known format for GraphQL devs
* Locality: final types are not scattered across multiple service definitions

Cons:
* The most verbose option of the list
* Arguably the least readable solution

### Linking

Simple, convention-driven case:
```
type Post {
    id: ID!
    title: String
    # this uses id as the default argument name, can be overridden
    @ResolveWith(inputField:"authorId")
    author: User
}
```

Full definition example:
```
type Post {
    id: ID!
    title: String
    @ResolveWith(service:"UserSvc", inputField:"authorId", query: 'user', queryArgument: 'id')
    author: User
}
```

### Full example

```
@DefinedBy(service:"PostSvc",allowDynamicSchema:true)
type Post {
    id: ID!
    title: String
    @ResolveWith(service:"UserSvc",inputField:"authorId")
    author: User
}

@DefinedBy(service:"UserSvc",allowDynamicSchema:false)
type User {
    id: ID!
    name: String
    @ResolveWith(service:"PostSvc",argumentName:"authorId")
    posts: [Post]
}

@Service(name:"PostSvc", url:"http://posts/graphql")
@Service(name:"UserSvc", url:"http://users/graphql")
type Query {
    @ImplementedBy(service:"PostSvc")
    post(id:ID!) : Post
    @ImplementedBy(service:"PostSvc")
    posts(authorId:ID) : [Post]
    @ImplementedBy(service:"UserSvc")
    user(id:ID!): User
    @ImplementedBy(service:"UserSvc")
    users: [User]
}
```

## Pure DSL

Pros

* Arguably the cleanest input
* Most complex implementation for libs parsing it

Cons

* One more language to learn (mitigated by the fact it's mostly SDL)

### Linking

Simple, convention-driven case:
```
type Post {
    id: ID!
    title: String
    # Resolution of the 'User' type defaults to a 'user' query
    authorId: ID => author:User
}

```

Full definition:
```
type Post {
    id: ID!
    title: String
    # Here we are informing that the final field will be called "author", will be of type User and will be resolved by
    # the query 'user', using authorId as the value for argument 'id'
    authorId: ID => author:User { user(id) }
}

```

### Enriching

Simple, convention-driven case:

```
# Using extend is a good, SDL-standard way of saying we are adding fields to a type that is defined elsewhere
extend type User {
    # Common fields must match the core type. At least an id field is expected (for matching)
    id: ID!
    # This instructs the stitcher to run the 'posts' service, defaulting the 'authorId' argument value to the 'id'
    posts : [Post] => { posts(authorId) }
}
```

Full definition:

```
# Using extend is a good, SDL-standard way of saying we are adding fields to a type that is defined elsewhere
extend type User {
    # Common fields must match the core type. At least an id field is expected (for matching)
    id: ID!
    # This instructs the stitcher to run the 'posts' service, using the 'id' field as the value for the 'authorId' argument
    posts : [Post] => { posts(authorId: id) }
}
```

### Full example

```
service PostSvc {
    url: "asd"

    type Post {
        id: ID!
        title: String
        authorId: ID => author:User
    }

    extend type User {
        id: ID!
        posts: [Post] => { posts(authorId) }
    }

    type Query {
        post(id:ID!) : Post
        posts(authorId:ID) : [Post]
    }

}

service UserSvc {
    url: "xyz"
    type User {
        id: ID!
        name: String
    }

    type Query {
        user(id:ID!): User
        users: [User]
    }
}
```

## Hybrid

### Linking

Simple, convention-driven case:
```
    type Post {
        id: ID!
        title: String
        @ConvertTo(type:"User",fieldName:"author")
        authorId: ID
    }
```

Full definition:

```
    type Post {
        id: ID!
        title: String
        @ConvertTo(type:"User",fieldName:"author",query:"user",argument:"id")
        authorId: ID
    }
```

### Enriching

Simple, convention-driven case:
```
    extend type User {
        id: ID!
        @ResolveWith(query:"posts",argument:"authorId")
        posts: [Post]
    }
```

Full definition:

```
    extend type User {
        id: ID!
        @ResolveWith(query:"posts",argument:"authorId",value:"id")
        posts: [Post]
    }
```

### Full example


```
service PostSvc {
    url: "asd"
    type Post {
        id: ID!
        title: String
        @ConvertTo(type:"User",fieldName:"author")
        authorId: ID
    }

    extend type User {
        id: ID!
        @ResolveWith(query:"posts",argument:"authorId")
        posts: [Post]
    }

    type Query {
        post(id:ID!) : Post
        posts(authorId:ID) : [Post]
    }
}

service UserSvc {
    url: "xyz"
    type User {
        id: ID!
        name: String
    }

    type Query {
        user(id:ID!): User
        users: [User]
    }
}
```
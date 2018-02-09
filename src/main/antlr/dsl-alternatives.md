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
    @ResolvedWith(service:"UserSvc",inputField:"authorId")
    author: User
}
```

Full definition example:
```
type Post {
    id: ID!
    title: String
    @ResolvedWith(service:"UserSvc", inputField:"authorId", query: 'User', queryArgument: 'id')
    author: User
}
```

### Full example

```
# Service can allow for both URLs or a service nickname (URLs being passed separately)
# allowDynamicSchema informs the stitcher to automatically add fields from the service into the final stitched schema
@DefinedBy(service:"PostSvc",allowDynamicSchema:true)
type Post {
    id: ID!
    title: String
    @ResolvedWith(service:"UserSvc",inputField:"authorId")
    author: User
}

@DefinedBy(service:"UserSvc",allowDynamicSchema:false)
type User {
    id: ID!
    name: String
    # This could have a default in case it's just one input argument, but starts getting into magic realm
    # Input value resolves to 'id' by default, can be overridden
    @ResolvedWith(service:"PostSvc",argumentName:"authorId")
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
    # Resolution of the 'User' type defaults to a 'user' query
    authorId: ID => author:User { user(id) }
}

```


### Full example

```
service PostSvc {
    url: "asd"

    type Post {
        id: ID!
        title: String
        # Resolution of the 'User' type defaults to a 'user' query
        authorId: ID => author:User
    }

    extend type User {
        id: ID!
        # Input value for the authorId argument defaults to the entity's id field
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

```
service PostSvc {
    url: "asd"
    type Post {
        id: ID!
        title: String
        # User resolves to the query 'user' and authorId resolves to the 'id' argument by convention
        @ConvertTo(type:"User",name:"author") 
        authorId: ID
    }

    extend type User {
        id: ID!
        # The argument value defaults to the type id so no need to input it as well
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
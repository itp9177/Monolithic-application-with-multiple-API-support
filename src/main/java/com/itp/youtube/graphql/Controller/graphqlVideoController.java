package com.itp.youtube.graphql.Controller;

import com.itp.youtube.graphql.dto.Author;
import com.itp.youtube.graphql.dto.Post;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class graphqlVideoController {

    @QueryMapping
    public List<Post> recentPosts(@Argument int count, @Argument int offset) {
        Post ab = new Post();
        ab.setId("hsdea");
        ab.setTitle("yes");
        ab.setAuthorId("hdea");
        ab.setCategory("new");

        Post ab1 = new Post();
        ab1.setId("hsdea");
        ab1.setTitle("yes");
        ab1.setAuthorId("hdea");
        ab1.setCategory("new");

       // return postDao.getRecentPosts(count, offset);
        return List.of(ab,ab1);
    }

    @SchemaMapping
    public Author author(Post post) {
        Author newAuthor = new Author();
        newAuthor.setId("uuidauth");
        newAuthor.setName("autho");
        return newAuthor;
    }
}

package com.itp.youtube.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Post {
    private String id;
    private String title;
    private String category;
    private String authorId;

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
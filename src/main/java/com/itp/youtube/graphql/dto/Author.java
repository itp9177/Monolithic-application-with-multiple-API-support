package com.itp.youtube.graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



public class Author {
    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
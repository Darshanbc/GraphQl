package com.darshan.graphql.practice.Model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Author {
    private String name;
    private Book book;
}

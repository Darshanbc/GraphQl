package com.darshan.graphql.practice.Model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Book {
    private String name;
    private List<Author> authors;
}

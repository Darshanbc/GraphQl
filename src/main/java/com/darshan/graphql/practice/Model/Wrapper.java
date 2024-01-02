package com.darshan.graphql.practice.Model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Wrapper {
    private String name;
    private List<Author> authors;
}

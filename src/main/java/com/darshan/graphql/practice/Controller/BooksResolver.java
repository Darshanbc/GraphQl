package com.darshan.graphql.practice.Controller;

import com.darshan.graphql.practice.Model.Author;
import com.darshan.graphql.practice.Model.Book;
import com.darshan.graphql.practice.Model.Wrapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;

@DgsComponent
public class BooksResolver {

    @DgsQuery(field = "book")
    public Book getBook(){
        return Book.builder()
                .name("b1")
                .authors(
                        List.of(
                                Author.builder().name("A1").build(),
                                Author.builder().name("A2").build()
                        )
                )
                .build();
    }

//    @DgsData(parentType = "Book", field = {"name","authors"})
//    private Wrapper getWrapper(){
//
//    }
}

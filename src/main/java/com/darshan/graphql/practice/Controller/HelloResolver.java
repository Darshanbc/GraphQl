package com.darshan.graphql.practice.Controller;

import com.darshan.graphql.practice.Model.Hello;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;

import java.util.List;

@DgsComponent
public class HelloResolver {

    @DgsQuery
    public List<Hello> allHellos(){
        return List.of(Hello.builder().randomNumber(12).text("hi").build(), Hello.builder().randomNumber(54).text("hello").build());
    }

    @DgsQuery
    public Hello oneHello(){
        return Hello.builder().randomNumber(0).text("Hi").build();
    }

}

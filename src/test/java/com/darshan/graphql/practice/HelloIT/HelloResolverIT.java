package com.darshan.graphql.practice.HelloIT;

import com.netflix.graphql.dgs.DgsQueryExecutor;

import org.intellij.lang.annotations.Language;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class HelloResolverIT {

    @Autowired
    DgsQueryExecutor dgsQueryExecutor;

    @Test
    void testOneHello(){

         @Language("GraphQL")
         var graphQuery= """
                {
                         oneHello{
                             ...partialFields
                         }
                     }
                     fragment partialFields on Hello{
                        
                         text
                     }
                 """;
         String text=dgsQueryExecutor.executeAndExtractJsonPath(graphQuery,"data.oneHello.text");
        Assertions.assertEquals(text,"Hi");
    }

}

package com.darshan.graphql.practice.Model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@Data
public class Hello {
    private String text;
    private Integer randomNumber;
}
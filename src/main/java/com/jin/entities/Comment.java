package com.jin.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Comment {

    @NonNull
    private Integer id;
    @NonNull
    private String text;
}

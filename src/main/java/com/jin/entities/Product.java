package com.jin.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Product {

    @NonNull
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private boolean inStock;
    @NonNull
    private BigDecimal price;
    private List<Comment> comments = new ArrayList<>();
}

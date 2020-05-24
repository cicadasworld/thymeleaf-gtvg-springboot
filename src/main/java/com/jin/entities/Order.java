package com.jin.entities;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Order {

    private Integer id;
    private Calendar date;
    private Customer customer;
    private Set<OrderLine> orderLines = new LinkedHashSet<>();
}

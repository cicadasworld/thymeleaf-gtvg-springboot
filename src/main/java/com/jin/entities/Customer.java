package com.jin.entities;

import java.util.Calendar;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Customer {

    private Integer id;
    private String name;
    private Calendar customerSince;
}

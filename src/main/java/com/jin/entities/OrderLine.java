package com.jin.entities;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class OrderLine {

    private Product product;
    private int amount;
    private BigDecimal purchasePrice;
}

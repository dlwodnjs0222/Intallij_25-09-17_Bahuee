package com.du.bagunee250917.domain;

import lombok.Data;

@Data
public class CartItem {
    private Long id;
    private Long productId;
    private int quantity;
    private Products product;
}

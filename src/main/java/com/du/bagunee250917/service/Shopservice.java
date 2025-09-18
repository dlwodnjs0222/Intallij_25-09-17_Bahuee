package com.du.bagunee250917.service;


import com.du.bagunee250917.domain.CartItem;
import com.du.bagunee250917.domain.Products;

import java.util.List;

public interface Shopservice {
    List<Products> getProducts();
    List<CartItem> getCartItems();

    void addProduct(Long productId, int quantity);
    void removeProduct(Long cartItemId);
}

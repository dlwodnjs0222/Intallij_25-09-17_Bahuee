package com.du.bagunee250917.service.impl;

import com.du.bagunee250917.dao.CartMapper;
import com.du.bagunee250917.dao.ProductMapper;
import com.du.bagunee250917.domain.CartItem;
import com.du.bagunee250917.domain.Products;
import com.du.bagunee250917.service.Shopservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements Shopservice {

    private final ProductMapper productMapper;
    private final CartMapper cartMapper;

    public ShopServiceImpl(ProductMapper productMapper, CartMapper cartMapper) {
        this.productMapper = productMapper;
        this.cartMapper = cartMapper;
    }


    @Override
    public List<Products> getProducts() {
        return productMapper.findAll();
    }

    @Override
    public List<CartItem> getCartItems() {
        return cartMapper.findAll();
    }

    @Override
    public void addProduct(Long productId, int quantity) {
        CartItem item = new CartItem();
        item.setProductId(productId);
        item.setQuantity(quantity);
        cartMapper.insert(item);
    }

    @Override
    public void removeProduct(Long cartItemId) {
        cartMapper.delete(cartItemId);
    }


}

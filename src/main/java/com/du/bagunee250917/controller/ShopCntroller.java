package com.du.bagunee250917.controller;

import com.du.bagunee250917.service.Shopservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopCntroller {
    private final Shopservice shopservice;

    public ShopCntroller(Shopservice shopservice){
        this.shopservice = shopservice;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("products",shopservice.getProducts());
        return "product_list";
    }

    @GetMapping("/cart")
    public String viewCart(Model model){
        model.addAttribute("cartItems",shopservice.getCartItems());
        return "cart";
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam Long cartItemId, @RequestParam int quantity){
        shopservice.addProduct(cartItemId, quantity);
        return "redirect:/cart";
    }

    @PostMapping("/cart/delete")
    public String deleteFromCart(@RequestParam Long cartItemId){
        shopservice.removeProduct(cartItemId);
        return "redirect:/cart";
    }
}

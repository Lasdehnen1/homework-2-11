package com.java.homework211.controller;

import com.java.homework211.Product;
import com.java.homework211.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequestMapping("/order/")
@RestController
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public List<Product> addProduct(@RequestParam(value = "productID") List<Integer> productID)  {
        return shoppingCartService.addProduct(productID);
    }

    @GetMapping("/get")
    public List<Product> getProduct() {
        return shoppingCartService.getProduct();
    }


}

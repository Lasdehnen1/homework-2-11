package com.java.homework211.service;

import com.java.homework211.Product;

import java.util.List;

public interface ShoppingCartService {
    List<Product> addProduct(List<Integer> productID);
    List<Product> getProduct();
}

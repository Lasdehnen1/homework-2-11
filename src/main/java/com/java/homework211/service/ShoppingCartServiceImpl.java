package com.java.homework211.service;

import com.java.homework211.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
@SessionScope
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> addProduct(List<Integer> productID) {
        List<Product> newList = productID.stream()
                .map(Product::new)
                .collect(Collectors.toList());
        products.addAll(newList);
        return newList;
    }

    @Override
    public List<Product> getProduct() {
        return products;
    }
}

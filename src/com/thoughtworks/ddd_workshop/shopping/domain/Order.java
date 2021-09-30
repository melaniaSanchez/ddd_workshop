package com.thoughtworks.ddd_workshop.shopping.domain;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {

    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
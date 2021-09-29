package com.thoughtworks.ddd_workshop.domain;


public class Cart {

    private Product item;

    public void addItem(Product product) {
        item = product;
    }

    public Product getItems() {
        return item;
    }
}

package com.thoughtworks.ddd_workshop.domain;


import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}

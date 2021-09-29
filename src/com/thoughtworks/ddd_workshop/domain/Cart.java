package com.thoughtworks.ddd_workshop.domain;


import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Product> deletedProducts = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Product> getDeletedProducts() {
        return deletedProducts;
    }

    public void removeItem(Product product) {
        items.removeIf(item -> item.getProduct().getName().equals(product.getName()));
        addDeletedProduct(product);
    }

    private void addDeletedProduct(Product product) {
        deletedProducts.add(product);
    }
}

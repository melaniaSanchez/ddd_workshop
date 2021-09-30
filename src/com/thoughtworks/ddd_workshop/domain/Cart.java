package com.thoughtworks.ddd_workshop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {

    private UUID uuid;
    private List<Item> items = new ArrayList<>();
    private List<Product> deletedProducts = new ArrayList<>();
    private Boolean checkout = false;

    public Cart(UUID uuid) {
        this.uuid = uuid;
    }
    public Cart() {
        this.uuid = UUID.randomUUID();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
    public UUID getUuid() { return uuid; }

    public List<Product> getDeletedProducts() { return deletedProducts; }

    public void removeItem(Product product) {
        items.removeIf(item -> item.getProduct().getName().equals(product.getName()));
        addDeletedProduct(product);
    }

    public Boolean equals(Cart cart) {
        if(cart == this) {
            return true;
        }

        if(cart.getUuid() == this.uuid) {
            return true;
        }
        return false;
    }

    public void checkout() {
        this.checkout = true;
    }

    private void addDeletedProduct(Product product) {
        deletedProducts.add(product);
    }
}

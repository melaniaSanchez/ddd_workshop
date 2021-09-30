package com.thoughtworks.ddd_workshop.domain.service;

import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Item;
import com.thoughtworks.ddd_workshop.domain.Order;
import com.thoughtworks.ddd_workshop.domain.Product;

import java.util.List;

public class OrderCreator {
    public Order createFrom(Cart cart) {
        Order order = new Order();
        List<Item> items = cart.getItems();
        items.forEach(item -> {
            for(int i = 1; i <= item.getQuantity(); i++) {
                order.addProduct(new Product(item.getProduct().getName(), item.getProduct().getPrice()));
            }
        });
        return order;
    }
}

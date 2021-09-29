package com.thoughtworks.ddd_workshop.application;

import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Product;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadpro = new Product("IPad Pro");

        cart.addItem(ipadpro);

        System.out.println(cart.getItems().toString());
    }
}

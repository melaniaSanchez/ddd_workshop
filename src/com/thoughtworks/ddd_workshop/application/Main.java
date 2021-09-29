package com.thoughtworks.ddd_workshop.application;

import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Product;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadpro = new Product("IPad Pro");
        Product pen = new Product("Hero ink Pen”");

        cart.addItem(ipadpro);
        cart.addItem(pen);

        System.out.println(cart.getItems().toString());
    }
}

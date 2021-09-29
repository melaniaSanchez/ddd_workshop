package com.thoughtworks.ddd_workshop.application;

import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Item;
import com.thoughtworks.ddd_workshop.domain.Product;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadpro = new Product("IPad Pro");
        Product pen = new Product("Hero ink Pen");
        Product shoes = new Product("Reebok Cricket bat");
        Product foo = new Product("foo");

        cart.addItem(new Item(ipadpro, 1));
        cart.addItem(new Item(pen, 1));
        cart.addItem(new Item(shoes,2));

        cart.removeItem(ipadpro);
        cart.removeItem(foo);

        System.out.println(cart.getItems().toString());
        System.out.println("-------------------------");
        System.out.println(cart.getDeletedProducts().toString());
    }
}

package com.thoughtworks.ddd_workshop.application;

import com.thoughtworks.ddd_workshop.domain.Cart;
import com.thoughtworks.ddd_workshop.domain.Item;
import com.thoughtworks.ddd_workshop.domain.Product;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Product ipadpro = new Product("IPad Pro");
        Product ipadpro1 = new Product("IPad Pro");
        Product ipadpro2 = new Product("IPad Pro");
        Product pen = new Product("Hero ink Pen");
        Product shoes = new Product("Reebok Cricket bat");
        Product foo = new Product("foo");

        cart.addItem(new Item(ipadpro, 1));
        cart1.addItem(new Item(ipadpro1, 1));
        cart2.addItem(new Item(ipadpro2, 1));
        cart.addItem(new Item(pen, 1));
        cart.addItem(new Item(shoes,2));

        cart.removeItem(ipadpro);
        cart.removeItem(foo);

        System.out.println(cart1.equals(cart1));
        System.out.println(cart1.equals(cart2));

        UUID uuid = UUID.randomUUID();
        Cart cart3 = new Cart(uuid);
        Cart cart4 = new Cart(uuid);
        System.out.println(cart3.equals(cart4));


        System.out.println(cart.getItems().toString());
        System.out.println("-------------------------");
        System.out.println(cart.getDeletedProducts().toString());

    }
}

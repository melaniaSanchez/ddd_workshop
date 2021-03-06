package com.thoughtworks.ddd_workshop.shopping.application;

import com.thoughtworks.ddd_workshop.shopping.domain.Cart;
import com.thoughtworks.ddd_workshop.shopping.domain.Item;
import com.thoughtworks.ddd_workshop.shopping.domain.Order;
import com.thoughtworks.ddd_workshop.shopping.domain.Price;
import com.thoughtworks.ddd_workshop.shopping.domain.Product;
import com.thoughtworks.ddd_workshop.shopping.domain.service.OrderCreator;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Price price = new Price(BigDecimal.valueOf(10.0));
        Cart cart = new Cart();
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Product ipadpro = new Product("IPad Pro", price, 0.0);
        Product ipadpro1 = new Product("IPad Pro", price, 0.0);
        Product ipadpro2 = new Product("IPad Pro", price, 0.0);
        Product pen = new Product("Hero ink Pen", price, 0.0);
        Product shoes = new Product("Reebok Cricket bat", price, 0.0);

        cart.addItem(new Item(ipadpro, 1));
        cart1.addItem(new Item(ipadpro1, 1));
        cart2.addItem(new Item(ipadpro2, 1));
        cart.addItem(new Item(pen, 1));
        cart.addItem(new Item(shoes,2));

        OrderCreator orderCreator = new OrderCreator();

        Order order = orderCreator.createFrom(cart);

        BigDecimal totalCost = order.calculateTotalCost();

        cart.removeItem(ipadpro);

        System.out.println(cart1.equals(cart1));
        System.out.println(cart1.equals(cart2));

        UUID uuid = UUID.randomUUID();
        Cart cart3 = new Cart(uuid);
        Cart cart4 = new Cart(uuid);
        System.out.println(cart3.equals(cart4));


        System.out.println(cart.getItems().toString());
        System.out.println("-------------------------");
        System.out.println(cart.getDeletedProducts().toString());

        System.out.println("Total costs for cart " + cart.getUuid() + " is " +totalCost);

    }
}

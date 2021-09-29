package com.thoughtworks.ddd_workshop.domain;


import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}

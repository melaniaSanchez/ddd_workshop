package com.thoughtworks.ddd_workshop.domain;

public class Product {

    private String name;
    private Price price;

    public Product(String name, Price price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Product: " + "name= " + name + ", " + price;
    }


}

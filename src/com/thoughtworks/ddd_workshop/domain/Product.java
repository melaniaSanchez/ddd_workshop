package com.thoughtworks.ddd_workshop.domain;

public class Product {

    private String name;

    public Product(String name){
        this.name = name;
    }

    public String toString(){
        return "Product: " + "name= " + name;
    }
}
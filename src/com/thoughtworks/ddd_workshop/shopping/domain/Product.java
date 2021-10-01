package com.thoughtworks.ddd_workshop.shopping.domain;

public class Product {

    private String name;
    private Price price;
    private Double weight;

    public Product(String name, Price price, Double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public Price getPrice() {
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    public String toString(){
        return "Product: " + "name= " + name + ", " + price + ", weight= " + weight;
    }


}

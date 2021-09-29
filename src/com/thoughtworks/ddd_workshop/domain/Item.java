package com.thoughtworks.ddd_workshop.domain;

public class Item {

    private Product product;
    private Integer quantity;

    public Item(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return this.product;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public String toString(){
        return product.toString() + ", quantity: " + this.quantity;
    }
}

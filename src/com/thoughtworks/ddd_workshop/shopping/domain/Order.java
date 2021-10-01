package com.thoughtworks.ddd_workshop.shopping.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    public static final double SHIPPING_COST = 0.01;
    private List<Product> products = new ArrayList<>();

    public Order() {

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public BigDecimal calculateTotalCost(){
        BigDecimal totalCost = new BigDecimal(0);

        for (Product product:products) {
            BigDecimal shippingCost = BigDecimal.valueOf(product.getWeight() * SHIPPING_COST);
            totalCost = product.getPrice().getValue().add(shippingCost);
        }

        return totalCost;
    }
}

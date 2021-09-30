package com.thoughtworks.ddd_workshop.shopping.domain;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class Price {

    private BigDecimal value;
    private Currency currency = Currency.getInstance(Locale.US);

    public Price(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Price= " + value +
                " " + currency;
    }
}

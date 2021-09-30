package com.thoughtworks.ddd_workshop.banking.domain;

public class Account {
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "address=" + address +
                '}';
    }
}

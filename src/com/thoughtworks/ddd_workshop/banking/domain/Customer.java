package com.thoughtworks.ddd_workshop.banking.domain;

import java.util.List;

public class Customer {
    private List<Account> accounts;
    private Address address;

    public Customer(List<Account> accounts, Address address) {
        this.accounts = accounts;
        this.address = address;
    }

    public void updateAddress(Address address){
        this.address = address;

        accounts.forEach(account -> {
            account.updateAddress(address);
        });
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accounts=" + accounts +
                ", address=" + address +
                '}';
    }
}

package com.thoughtworks.ddd_workshop.banking.domain;

import java.util.UUID;

public class Account {
    private UUID uuid;
    private Address address;

    public Account(Address address) {
        this.uuid = UUID.randomUUID();
        this.address = address;
    }

    public Account(UUID uuid, Address address) {
        this.uuid = uuid;
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

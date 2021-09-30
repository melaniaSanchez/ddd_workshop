package com.thoughtworks.ddd_workshop.banking.application;

import com.thoughtworks.ddd_workshop.banking.domain.Account;
import com.thoughtworks.ddd_workshop.banking.domain.Address;
import com.thoughtworks.ddd_workshop.banking.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Barcelona");

        Account account1 = new Account(address);
        Account account2 = new Account(address);

        List<Account> accounts = List.of(account1, account2);

        Customer customer = new Customer(accounts, address);

        System.out.println("First address");
        System.out.println(customer);

        Address address2 = new Address("Berlin");
        customer.updateAddress(address2);

        System.out.println("Updated address");
        System.out.println(customer);
    }
}

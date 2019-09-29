package com.company;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "test@email.com");
    }

    public VIPCustomer() {
        this("new customer", 0.0, "test@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

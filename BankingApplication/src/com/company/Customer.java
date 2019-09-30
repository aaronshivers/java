package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialBalance) {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialBalance);
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public String getName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

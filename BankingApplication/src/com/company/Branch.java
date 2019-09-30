package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialBalance) {
        if (findCustomer(customerName) == null) return false;

        this.customers.add(new Customer(customerName, initialBalance));
        return true;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer == null) return false;

        foundCustomer.addTransaction(amount);
        return true;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}

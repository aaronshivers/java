package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) return false;

        this.branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialBalance) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch == null) return false;

        return foundBranch.addCustomer(customerName, initialBalance);
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch == null) return false;

        return foundBranch.addTransaction(customerName, amount);
    }

    private Branch findBranch(String branchName) {
        for (Branch foundBranch : branches) {
            if (foundBranch.getName().equals(branchName)) {
                return foundBranch;
            }
        }

        return null;
    }

    public boolean getCustomers(String branchName, boolean showTransactions) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch == null) return false;

        System.out.println("Branch: " + foundBranch.getName());
        System.out.println("\tCustomer Details:");

        ArrayList<Customer> branchCustomers = foundBranch.getCustomers();

        for (Customer branchCustomer : branchCustomers) {
            System.out.println("\t\tCustomer: " + branchCustomer.getName());
            if (showTransactions) {
                System.out.print("\t\t\tTransactions: ");
                ArrayList<Double> transactions = branchCustomer.getTransactions();

                for (Double transaction: transactions) {
                    System.out.println(transaction);
                }
            }
        }
        return true;
    }
}

package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Account() {
        this("3423", 2.50, "Default Name", "Default address", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String emailAddress, String phoneNumber) {
        this("9999", 100.50, customerName, emailAddress, phoneNumber);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double funds) {
        System.out.println("Starting Balance: " + balance);
        System.out.println("Deposit Amount: " + funds);
        setBalance(balance + funds);
        System.out.println("New Balance: " + balance);
    }

    public void withdrawalFunds(double funds) {
        System.out.println("Starting Balance: " + balance);
        System.out.println("Deposit Amount: " + funds);
        if (balance >= funds) setBalance(balance - funds);
        System.out.println("New Balance: " + balance);
    }
}

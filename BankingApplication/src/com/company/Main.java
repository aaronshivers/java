package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Super Awesome Bank");

        bank.addBranch("Independence");

        bank.addCustomer("Independence", "Fred", 25.00);
        bank.addCustomer("Independence", "Jeff", 10.25);
        bank.addCustomer("Independence", "Sally", 205.75);

        bank.addBranch("Blue Springs");

        bank.addCustomer("Blue Springs", "Tina", 41.10);
        bank.addCustomer("Blue Springs", "Barry", 55.55);
        bank.addCustomer("Blue Springs", "Jean", 1.75);

        bank.getCustomers("Independence", false);
    }
}

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
//        bank.addCustomer("Blue Springs", "Barry", 55.55);
//        bank.addCustomer("Blue Springs", "Jean", 1.75);

        bank.getCustomers("Blue Springs", true);

        bank.addBranch("Lee's Summit");
        if (!bank.addCustomer("Lee's Summit", "Bill", 5.53)) {
            System.out.println("Error: Branch doesn't exist");
        }

        if (!bank.addBranch("Independence")) {
            System.out.println("Bank already exists");
        }

        if (!bank.addTransaction("Independence", "Chester", 33.3)) {
            System.out.println("Customer doesn't exist");
        }

        if (!bank.addCustomer("Independence", "Fred", 5.53)) {
            System.out.println("Error: Customer already Exists");
        }
    }
}

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Bob", 54.96);
        Customer customer2;
        customer2 = customer;
        customer2.setBalance(12.18);
        System.out.println(customer.getName() + " Balance: " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

        integerArrayList.add(1, 2);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }
    }
}

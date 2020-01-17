package com.company;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Order> orders = new ArrayList<Order>();

    public static void main(String[] args) {

        Order order = new Order(1);

        Pizza pizza = new Pizza("medium");
        pizza.addTopping("sauce");
        pizza.addTopping("cheese", true);
        pizza.addTopping("ham");

    }
}

package com.aaronshivers;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Order> orders = new ArrayList<Order>();

    public static void main(String[] args) {

        Order order = new Order(1);

        Sandwich sandwich = new Sandwich();
        sandwich.addIngredient("Bread");
        sandwich.addIngredient("Peanut Butter");
        sandwich.addIngredient("Jelly");

        PeanutButterAndJelly peanutButterAndJelly = new PeanutButterAndJelly();

        order.addSandwich(peanutButterAndJelly);
        order.addSandwich(sandwich);

        orders.add(order);

        System.out.println(orders);
    }
}

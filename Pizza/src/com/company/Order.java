package com.company;

import java.util.ArrayList;

public class Order {
    private int number;
    private ArrayList<Pizza> pizzas;

    public Order(int number) {
        this.number = number;
        this.pizzas = new ArrayList<Pizza>();
    }

    public int getOrderNumber() {
        return number;
    }
}

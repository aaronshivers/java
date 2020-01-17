package com.aaronshivers;

import java.util.ArrayList;

public class Order {
    private int number;
    private ArrayList<Sandwich> sandwiches;

    public Order(int number) {
        this.number = number;
        this.sandwiches = new ArrayList<Sandwich>();
    }

    public void addSandwich(Sandwich sandwich) {
        this.sandwiches.add(sandwich);
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", sandwiches=" + sandwiches +
                '}';
    }
}

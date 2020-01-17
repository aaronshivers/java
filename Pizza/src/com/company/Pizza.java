package com.company;

import java.util.ArrayList;

public class Pizza {
    private String size;
    private ArrayList<Topping> toppings;

    public Pizza(String size) {
        this.size = size;
        this.toppings = new ArrayList<Topping>();
    }

    public void addTopping(String name) {
        addTopping(name, false);
    }

    public boolean addTopping(String name, Boolean extra) {
        if (findTopping(name) == null) return false;

        return toppings.add(new Topping(name, extra));
    }

    private Topping findTopping(String name) {
        for (Topping topping : toppings) {
            if (topping.getName().equals(name)) {
                return topping;
            }
        }
        return null;
    }
}

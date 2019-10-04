package com.company;

import java.util.ArrayList;

public class Supreme extends Pizza {
    private String name;
    private ArrayList<Topping> toppings;

    public Supreme(String size) {
        super(size);
        this.name = "Supreme";
        this.toppings = new ArrayList<Topping>();
    }
}

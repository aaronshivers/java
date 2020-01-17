package com.aaronshivers;

import java.util.ArrayList;

public class PeanutButterAndJelly extends Sandwich {
    private String name;
    private ArrayList<Ingredient> ingredients;

    public PeanutButterAndJelly() {
        this.name = "Peanut Butter And Jelly";
        this.ingredients = new ArrayList<Ingredient>();
    }

    @Override
    public String toString() {
        return name;
    }
}

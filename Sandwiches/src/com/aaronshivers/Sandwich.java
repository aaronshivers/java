package com.aaronshivers;

import java.util.ArrayList;

public class Sandwich {
    private ArrayList<Ingredient> ingredients;

    public Sandwich() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(String name) {
        addIngredient(name, false);
    }

    public boolean addIngredient(String name, boolean extra) {
        if (findIngredient(name) == null) return false;

        return ingredients.add(new Ingredient(name, extra));
    }

    private Ingredient findIngredient(String name) {
        for (Ingredient ingredient: ingredients) {
            if (ingredient.getName().equals(name)) {
                return ingredient;
            }
        }
        return null;
    }
}

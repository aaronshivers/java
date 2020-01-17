package com.aaronshivers;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<Ingredient>();
    }

    public boolean addIngredient(String name, String measurement, double quantity) {
        if (findIngredient(name) == null) return false;

        return ingredients.add(new Ingredient(name, measurement, quantity));
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

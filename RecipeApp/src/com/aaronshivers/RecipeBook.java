package com.aaronshivers;

import java.util.ArrayList;

public class RecipeBook {
    private int number;
    private ArrayList<Recipe> recipes;

    public RecipeBook(int number) {
        this.number = number;
        this.recipes = new ArrayList<Recipe>();
    }

    public int getRecipeNumber() {
        return number;
    }
}

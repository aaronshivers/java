package com.aaronshivers;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Recipe> recipes = new ArrayList<Recipe>();

    public static void main(String[] args) {

        Recipe recipe = new Recipe("Pizza");

        Ingredient ingredient = new Ingredient("cheese", "cups", 2);

        recipe.addIngredient("cheese", "cups", 2);

        recipes.add(recipe);

        System.out.println(recipes);
    }
}

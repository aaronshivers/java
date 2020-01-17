package com.aaronshivers;

public class Ingredient {
    private String name;
    private String measurement;
    private double quantity;

    public Ingredient(String name, String measurement, double quantity) {
        this.name = name;
        this.measurement = measurement;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}

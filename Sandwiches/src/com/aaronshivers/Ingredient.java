package com.aaronshivers;

public class Ingredient {
    private String name;
    private boolean extra;

    public Ingredient(String name, boolean extra) {
        this.name = name;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", extra=" + extra +
                '}';
    }
}

package com.company;

public class Couch {
    private String material;
    private String color;
    private int length;

    public Couch(String material, String color, int length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }
}

package com.company;

public class Television {
    private String manufacturer;
    private String model;
    private int width;
    private int length;

    public Television(String manufacturer, String model, int width, int length) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.width = width;
        this.length = length;
    }

    public void activate() {
        System.out.println("Television -> Activating");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}

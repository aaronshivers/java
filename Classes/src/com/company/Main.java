package com.company;

public class Main {

    public static void main(String[] args) {
        Car ford = new Car();
        Car dodge = new Car();
        System.out.println("Model is " + dodge.getModel());

        ford.setModel("F150");
        System.out.println("Model is " + ford.getModel());
    }
}

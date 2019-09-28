package com.company;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe Burger", "Angus", 9.25, "White");
        super.addBaseBurgerAddition1("Chips", 2.57);
        super.addBaseBurgerAddition2("Drink", 3.50);
    }

    @Override
    public void addBaseBurgerAddition1(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }

    @Override
    public void addBaseBurgerAddition2(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }

    @Override
    public void addBaseBurgerAddition3(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }

    @Override
    public void addBaseBurgerAddition4(String name, double price) {
        System.out.println("Cannot add items to deluxe burger");
    }
}

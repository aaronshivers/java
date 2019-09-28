package com.company;

public class VeggieBurger extends Burger {
    private String veggieBurgerExtra1Name;
    private double veggieBurgerExtra1Price;

    private String veggieBurgerExtra2Name;
    private double veggieBurgerExtra2Price;

    public VeggieBurger(String meat, double price) {
        super("Veggie Burger", meat, price, "Brown Rye");
    }

    public void addVeggieBurgerExtra1(String name, double price) {
        this.veggieBurgerExtra1Name = name;
        this.veggieBurgerExtra1Price = price;
    }

    public void addVeggieBurgerExtra2(String name, double price) {
        this.veggieBurgerExtra2Name = name;
        this.veggieBurgerExtra2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();

        if (veggieBurgerExtra1Name != null) {
            burgerPrice += veggieBurgerExtra1Price;
            System.out.println("Added " + veggieBurgerExtra1Name + " for an extra " + veggieBurgerExtra1Price);
        }

        if (veggieBurgerExtra2Name != null) {
            burgerPrice += veggieBurgerExtra2Price;
            System.out.println("Added " + veggieBurgerExtra2Name + " for an extra " + veggieBurgerExtra2Price);
        }

        return burgerPrice;
    }
}

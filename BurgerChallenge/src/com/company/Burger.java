package com.company;

public class Burger {
    private String name;
    private String meat;
    private double price;
    private String bunType;

    private String additionalItem1Name;
    private double additionalItem1Price;

    private String additionalItem2Name;
    private double additionalItem2Price;

    private String additionalItem3Name;
    private double additionalItem3Price;

    private String additionalItem4Name;
    private double additionalItem4Price;

    public Burger(String name, String meat, double price, String bunType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bunType = bunType;
    }

    public void addBaseBurgerAddition1(String name, double price) {
        this.additionalItem1Name = name;
        this.additionalItem1Price = price;
    }

    public void addBaseBurgerAddition2(String name, double price) {
        this.additionalItem2Name = name;
        this.additionalItem2Price = price;
    }

    public void addBaseBurgerAddition3(String name, double price) {
        this.additionalItem3Name = name;
        this.additionalItem3Price = price;
    }

    public void addBaseBurgerAddition4(String name, double price) {
        this.additionalItem4Name = name;
        this.additionalItem4Price = price;
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(name + " burger on a " + bunType + " bun with " + meat + ", Price: $" + price);

        if (additionalItem1Name != null) {
            burgerPrice += this.additionalItem1Price;
            System.out.println("Added " + this.additionalItem1Name + " for an extra " + this.additionalItem1Price);
        }

        if (additionalItem2Name != null) {
            burgerPrice += this.additionalItem2Price;
            System.out.println("Added " + this.additionalItem2Name + " for an extra " + this.additionalItem2Price);
        }

        if (additionalItem3Name != null) {
            burgerPrice += this.additionalItem3Price;
            System.out.println("Added " + this.additionalItem3Name + " for an extra " + this.additionalItem3Price);
        }

        if (additionalItem4Name != null) {
            burgerPrice += this.additionalItem4Price;
            System.out.println("Added " + this.additionalItem4Name + " for an extra " + this.additionalItem4Price);
        }

        return burgerPrice;
    }
}

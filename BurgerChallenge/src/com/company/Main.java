package com.company;

public class Main {

    public static void main(String[] args) {
//        Burger burger = new Burger("Basic", "Beef", 3.56, "White");
////        double price = burger.itemizeBurger();
//        burger.addBaseBurgerAddition1("Tomato", .25);
//        burger.addBaseBurgerAddition2("lettuce", .1);
//        burger.addBaseBurgerAddition3("cheese", .5);
//        System.out.println("Total burger price is " + burger.itemizeBurger());
//
//        VeggieBurger veggieBurger = new VeggieBurger("vegetable patty", 5.23);
//        veggieBurger.addVeggieBurgerExtra1("egg", 1.15);
//        System.out.println("Total Veggie Burger price is " + veggieBurger.itemizeBurger());

	    DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeBurger();
        deluxeBurger.addBaseBurgerAddition3("wha happened?", 2.5);

    }
}

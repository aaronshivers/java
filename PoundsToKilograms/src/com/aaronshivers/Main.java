package com.aaronshivers;

public class Main {

    public static void main(String[] args) {

        System.out.println("5 lbs. = " + poundsToKilograms(5) + " kgs.");
        System.out.println("3 lbs. = " + poundsToKilograms(3) + " kgs.");
    }

    public static double poundsToKilograms(double lbs) {
        double conversionRate = 0.45359237;
        return lbs * conversionRate;
    }
}

package com.aaronshivers;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is is a string";
        System.out.println("myString = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString = " + myString);
        myString = myString + " \u00a9 2019";
        System.out.println("myString = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString " + lastString);
    }
}

package com.aaronshivers;

public class Main {

    public static void main(String[] args) {

        double myFirstDoubleVariable = 20.00;
        double mySecondDoubleVariable = 80.00;
        double result = (myFirstDoubleVariable + mySecondDoubleVariable) * 100;
        System.out.println("result = " + result);
        double remainder = result % 40.00;
        System.out.println("remainder = " + remainder);
        boolean myBoolean = remainder == 0;
        System.out.println("myBoolean = " + myBoolean);
        if (!myBoolean) {
            System.out.println("Got some remainder");
        }
    }
}

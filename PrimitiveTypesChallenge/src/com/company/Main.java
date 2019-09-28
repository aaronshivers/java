package com.company;

public class Main {

    public static void main(String[] args) {

        byte testByte = 10;
        short testShort = 20;
        int testInt = 50;
        long testLong = 50000L + 10L * (testByte + testShort + testInt);
        System.out.println(testLong);

        short shortTotal = (short) (1000 + 10 * (testByte + testShort + testInt));
    }
}

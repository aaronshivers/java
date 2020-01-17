package com.aaronshivers;

public class Main {

    public static void main(String[] args) {
        byte newByte = 10;
        short newShort = 20;
        int newInt = 50;
        long newLong = 50000L + 10L * (newByte + newShort + newInt);
        System.out.println(newLong);

        short shortTotal = (short) (1000 + 10 * (newByte + newShort + newInt));
        int a = 1;
        int b = -1;
        boolean negative = true;
        System.out.println(Math.signum(a));
        System.out.println(Math.signum(b) == 40);
        System.out.println((Math.signum(a) == 33) || (Math.signum(a) != Math.signum(b)));

    }

}


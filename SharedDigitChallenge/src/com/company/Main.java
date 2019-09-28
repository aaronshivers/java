package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        int num1a = num1 % 10;
        int num1b = num1 /= 10;

        int num2a = num2 % 10;
        int num2b = num2 /= 10;

        return num1a == num2a || num1a == num2b || num1b == num2a || num1b == num2b;
    }
}

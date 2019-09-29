package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22, 23, 34)); // false
//        System.out.println(hasSameLastDigit(41, 22, 71)); // true
//        System.out.println(hasSameLastDigit(23, 32, 42)); // true
//        System.out.println(hasSameLastDigit(9, 99, 999)); // false
//
//        System.out.println(isValid(10)); // true
//        System.out.println(isValid(468)); // true
//        System.out.println(isValid(1051)); // false
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;

        int a = num1 % 10;
        int b = num2 % 10;
        int c = num3 % 10;

        return a == b || a == c || b == c;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}

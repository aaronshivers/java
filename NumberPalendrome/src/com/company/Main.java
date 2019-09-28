package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalendrome(-1221)); // true
        System.out.println(isPalendrome(707)); // true
        System.out.println(isPalendrome(11212)); // false
    }

    public static boolean isPalendrome(int number) {
        int originalNumber = number;
        int reversed = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (reversed > 0) {
                reversed = lastDigit;
            } else {
                reversed += lastDigit;
            }

            reversed *= 10;

            number -= lastDigit;
            number /= 10;
        }

        System.out.println(reversed);

        return reversed == originalNumber;
    }
}

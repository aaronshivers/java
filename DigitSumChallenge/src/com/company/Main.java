package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in 125 is " + sumDigits(125)); // 8
        System.out.println("The sum of the digits in -125 is " + sumDigits(-125)); // 8
        System.out.println("The sum of the digits in 4 is " + sumDigits(4)); // 8
        System.out.println("The sum of the digits in 32123 is " + sumDigits(32123)); // 8
    }

    private static int sumDigits(int number) {
        if (number < 10) return -1;

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}

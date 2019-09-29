package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125)); // 8
        System.out.println(sumDigits(1)); // -1
    }

    public static int sumDigits(int number) {
        if (number < 10) return -1;

        int count = 0;
        int divisor = 10;

        while (number > 0) {
            int digit = number % divisor;
            count += digit;
            System.out.println("count " + count);
            System.out.println("divisor " + divisor);
            number = number / divisor;
            divisor *= 10;
        }

        return count;
    }
}

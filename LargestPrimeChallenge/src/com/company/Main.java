package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(2)); // 2
    }

    public static int getLargestPrime(int number) {

        for (int i = number; i >= 2; i--) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && number % i == 0) return i;
        }

        return -1;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}

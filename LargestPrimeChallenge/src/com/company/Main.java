package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1
    }

    public static int getLargestPrime(int number) {

        for (int i = number; i > 2; i--) {

            boolean isPrime = false;

            for (int j = 2; j < number; j++) {
                isPrime = (number % j == 0);
            }

            if (isPrime && number % i == 0) return i;
        }

        return -1;
    }
}

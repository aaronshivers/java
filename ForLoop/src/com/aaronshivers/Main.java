package com.aaronshivers;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        int primes = 0;

        for (int i = 1; i < 100; i++) {
            if (primes >= 30) break;

            if (isPrime(i)) {
                System.out.println(i);
                primes++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }
}

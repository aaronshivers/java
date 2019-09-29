package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 100; i++) {

            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }

            if (count >= 20) break;
        }

//        for (int i = 2; i <= 8; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
//        }
//
//        System.out.println("***********");
//
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
//        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int count = 0;
        for (int i = 2; i <= (long) Math.sqrt(n) ; i++) {
            System.out.println("count" + count);
            count++;
            if (n % i == 0) return false;
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}

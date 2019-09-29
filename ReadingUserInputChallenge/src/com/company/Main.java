package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 numbers. Each followed by pressing enter.");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                System.out.println("Invalid Number.");
                break;
            } else {
                sum += scanner.nextInt();
            }
        }

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}

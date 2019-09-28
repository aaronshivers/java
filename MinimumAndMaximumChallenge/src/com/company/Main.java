package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while (true) {
            System.out.println("Enter a number:");

            if (!scanner.hasNextInt()) break;

            int cur =  scanner.nextInt();

            if (cur > max) max = cur;
            if (cur < min) min = cur;

            System.out.println("Min: " + min + " Max: " + max);
        }

        scanner.close();
    }
}

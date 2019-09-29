package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg;
        int count = 0;

        while (true) {

            if (!scanner.hasNextInt()) break;

            int cur = scanner.nextInt();

            count++;
            sum += cur;
        }

        avg = (int) Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}

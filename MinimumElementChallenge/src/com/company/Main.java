package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] intArray = readIntegers(5);
        int minValue = findMin(intArray);

        System.out.println("Minimum Value: " + minValue);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) minValue = array[i];
        }

        return minValue;
    }
}

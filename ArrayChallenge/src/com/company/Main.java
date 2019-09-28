package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = getIntegers(5);

        int[] sortedArray = sortIntegers(array);

        printArray(sortedArray);

    }

    private static int[] getIntegers(int elements) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[elements];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int[] sortIntegers(int[] array) {

        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }

    private static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}

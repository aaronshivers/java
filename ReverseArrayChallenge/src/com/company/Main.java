package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int halfLength = array.length / 2;
        int maxLength = array.length - 1;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxLength - i];
            array[maxLength - i] = temp;
        }
    }
}

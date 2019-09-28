package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("*****");
//
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("******");
//
//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100) break;
//        } while (count != 6);

        int currentNumber = 4;
        int lastNumber = 20;
        int count = 0;

        while (currentNumber <= lastNumber) {
            currentNumber++;

            if (!isEvenNumber(currentNumber)) {
                continue;
            }

            if (count >= 5) break;
            count++;

            System.out.println("Even number " + currentNumber);
        }

        System.out.println("Total count of even numbers: " + count);

    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0)); // 1
//        System.out.println(getDigitCount(123)); // 3
//        System.out.println(getDigitCount(-12)); // -1
//        System.out.println(getDigitCount(5200)); // 4
//        System.out.println(getDigitCount(101)); // 3
//        System.out.println(getDigitCount(1)); // 1

//        System.out.println(reverse(-121)); // -121
//        System.out.println(reverse(1212)); // 2121
//        System.out.println(reverse(1234)); // 4321
//        System.out.println(reverse(100)); // 1
//        System.out.println(reverse(1010)); // 101

//        numberToWords(123); // "One Two Three"
//        numberToWords(1010); // "One Zero One Zero"
//        numberToWords(1000); // "One Zero Zero Zero"
//        numberToWords(-12); // "Invalid Value"
        numberToWords(0); // "Zero"
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        if (number == 0) System.out.println("Zero");

        int reversedNumber = reverse(number);
        int currentNumber = reversedNumber;

        while (currentNumber > 0) {
            int lastDigit = currentNumber % 10;
            currentNumber /= 10;

            switch (lastDigit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
        }

        int extraZeros = getDigitCount(number) - getDigitCount(reversedNumber);

        for (int i = 0; i < extraZeros; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {

        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            number /= 10;

            reversed = reversed * 10 + lastDigit;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int digitCount = number < 1 ? 1 : 0;

        while (number >= 1) {
            digitCount++;
            number /= 10;
        }

        return digitCount;
    }
}

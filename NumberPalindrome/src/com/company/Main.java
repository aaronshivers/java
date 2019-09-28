package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(11212)); // false
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reversed = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reversed *= 10;
            reversed += remainder;
            palindrome /= 10;
        }

        return number == reversed;
    }
}

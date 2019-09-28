package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello There!"));
    }
    
    public static String reverseString(String string) {
        String reversed = "";
        
        for (int i = 0; i < string.length(); i++) {
            reversed = string.charAt(i) + reversed;
        }

        return reversed;
    }
}

package com.aaronshivers;

public class Main {

    public static void main(String[] args) {
        int value = 3;

        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is 3, 4, or 5");
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }

        char myChar = 'E';

        switch (myChar) {
            case 'A':
                System.out.println("myChar = A");
                break;
            case 'B':
                System.out.println("myChar = B");
                break;
            case 'C':
                System.out.println("myChar = C");
                break;
            case 'D':
                System.out.println("myChar = D");
                break;
            case 'E':
                System.out.println("myChar = E");
                break;
            default:
                System.out.println("myChar not found");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Something else.");
                break;
        }
    }
}

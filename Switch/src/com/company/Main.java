package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value is 1");
//        } else if (value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Value is not 1 or 2");
//        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3, 4, or 5");
                System.out.println("Value is " + switchValue);
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }

        char charVariable = 'b';

        switch (charVariable) {
            case 'a':
                System.out.println("Found a");
                break;
            case 'b':
                System.out.println("Found b");
                break;
            case 'c':
                System.out.println("Found c");
                break;
            case 'd':
                System.out.println("Found d");
                break;
            case 'e':
                System.out.println("Found e");
                break;
            default:
                System.out.println("not found");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}

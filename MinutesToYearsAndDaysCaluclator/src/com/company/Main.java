package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600); // "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600); // "561600 min = 1 y and 25 d"
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hour = 60;
            int day = 24;
            int year = 365;
            int hours = (int) minutes / hour;
            int days = hours / day;
            int years = (int) days / year;
            int remainingDays = days % year;

            String message = minutes + " min = " + years + " y and " + remainingDays + " d";
            System.out.println(message);
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Bob", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 5);
        if (centimeters < 0) {
            System.out.println("Invalid Parameters");
        }
        System.out.println(centimeters);
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;

        double totalInches = (feet * 12) + inches;
        double centimeters = totalInches * 2.54;

        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) return -1;

        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

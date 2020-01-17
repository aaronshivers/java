package com.aaronshivers;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Bob", 500);
//        System.out.println("newScore = " + newScore);
//        calculateScore(75);
//        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(3, 2));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed Player, no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches <= 0 || inches >= 12) return -1;

        double centimetersPerInch = 2.54;

        return inches * centimetersPerInch;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet <= 0 || inches <= 0 || inches >= 12) return -1;

        inches += feet * 12;

        return calcFeetAndInchesToCentimeters(inches);
    }
}

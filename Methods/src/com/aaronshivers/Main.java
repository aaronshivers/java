package com.aaronshivers;

public class Main {

    public static void main(String[] args) {
//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score is " + highScore);
//
//        calculateScore(true, 10000, 8, 200);
//        calculateScore(false, 10000, 8, 200);

        displayHighScorePosition("Bob", calculateHighScorePosition(1500));
        displayHighScorePosition("Sally", calculateHighScorePosition(900));
        displayHighScorePosition("Jerry", calculateHighScorePosition(400));
        displayHighScorePosition("Alice", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("Player " + playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}

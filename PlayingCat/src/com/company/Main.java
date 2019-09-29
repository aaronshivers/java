package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10)); // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true
        System.out.println(isCatPlaying(true, 33)); // true
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (temperature < 25 || temperature > 45) return false;
        return isSummer || temperature <= 35;
    }
}

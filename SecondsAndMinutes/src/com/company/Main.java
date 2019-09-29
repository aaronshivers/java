package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(30000));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE;

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String formattedHours = hours < 10 ? "0" + hours : "" + hours;
        String formattedMinutes = minutes < 10 ? "0" + remainingMinutes : "" + remainingMinutes;
        String formattedSeconds = seconds < 10 ? "0" + seconds : "" + seconds;


        return formattedHours + "h " + formattedMinutes + "m " + formattedSeconds + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) return INVALID_VALUE_MESSAGE;

        int minutes = seconds / 60;
        int remainingSeconds = minutes % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}

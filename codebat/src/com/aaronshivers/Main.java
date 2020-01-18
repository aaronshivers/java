package com.aaronshivers;

public class Main {

    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }

    private static String notString(String str) {
        return str.length() >= 3 && str.substring(0, 3).equals("not") ? str : "not " + str;
    }
}

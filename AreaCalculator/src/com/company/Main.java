package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0)); // 78.53975
        System.out.println(area(-1)); // -1
        System.out.println(area(5.0, 4.0)); // 20.0
        System.out.println(area(-1, 4.0)); // -1
    }

    public static double area(double radius) {
        return radius < 0 ? -1 : Math.PI * Math.pow(radius, 2);
    }

    public static double area(double length, double width) {
        return length < 0 || width < 0 ? -1 : length * width;
    }
}

package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strings = new String[10];
        int[] ints = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("tim");

//        ArrayList<int> ints1 = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = 54;
        Double doubleValue = 2.3;

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i ++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i ++) {
            System.out.println(integerArrayList.get(i).intValue());
        }

        Integer myIntVal = 56; // Integer.valueOf(56);
        int myIn = myIntVal; // myInt.intValue();

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double i = 0.0; i < 10.0; i+= 0.5) {
            doubleArrayList.add(i);
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            System.out.println(doubleArrayList.get(i));
        }
    }
}

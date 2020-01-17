package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(1234);
        myPhone.powerOn();
        myPhone.callPhone(1234);
        myPhone.answer();

        myPhone = new MobilePhone(23424);
        myPhone.powerOn();
        myPhone.callPhone(23424);
        myPhone.answer();
    }
}

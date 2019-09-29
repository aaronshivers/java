package com.company;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contacts = new ArrayList<String>();
    private String name;
    private int phoneNumber;

    public Contacts() {

    }

    public void getContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void createContact(String name) {
        contacts.add(name);
    }

    private int findContact(String name) {
        return contacts.indexOf(name);
    }

    public boolean onFile(String name) {
        return findContact(name) >= 0;
    }
}

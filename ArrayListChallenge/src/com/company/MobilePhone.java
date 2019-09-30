package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean createContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println(contact + " Already Exists");
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " Not Found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact Already Exists");
            return false;
        }
        myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " Updated to: " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " Not Found");
            return false;
        }
        myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was Deleted");
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        return findContact(contact) >= 0 ? contact.getName() : null;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        return index >= 0 ? myContacts.get(index) : null;
    }

    public void getContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(
                myContacts.get(i).getName() + " - " +
                myContacts.get(i).getPhoneNumber()
            );
        }
    }
}

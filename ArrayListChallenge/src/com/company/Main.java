package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("816-123-4567");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        getHelp();

        while (!quit) {
            System.out.println("Enter Selection: ");
            int selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    getHelp();
                    break;
                case 1:
                    mobilePhone.getContacts();
                    break;
                case 2:
                    createContact();
                    break;
                case 3:
                    queryContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void getContacts() {
        mobilePhone.getContacts();
    }

    public static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void createContact() {
        System.out.println("Enter New Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.createContact(newContact)) {
            System.out.println("New Contact Added: " + name + " - " + phoneNumber);
        } else {
            System.out.println("Cannot Add. " + name + " Already on File");
        }
    }

    private static void updateContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Enter New Contact Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter New Phone Number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully Updated Contact");
        } else {
            System.out.println("Error Updating Contact");
        }
    }

    public static void removeContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact Not Found");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully Deleted Contact");
        } else {
            System.out.println("Error Deleting Contact");
        }
    }

    public static void queryContact() {
        System.out.println("Enter Existing Contact Name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact Not Found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " Phone Number: " + existingContact.getPhoneNumber());
    }

    public static void getHelp() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Get Help");
        System.out.println("\t 1 - Show Contacts");
        System.out.println("\t 2 - Add Contact");
        System.out.println("\t 3 - Find Contact");
        System.out.println("\t 4 - Edit Contact");
        System.out.println("\t 5 - Remove Contact");
        System.out.println("\t 6 - Exit");
    }
}

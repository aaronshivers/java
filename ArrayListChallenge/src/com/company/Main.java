package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    private static Contacts contacts = new Contacts();

    public static void main(String[] args) {
        boolean quit = false;
        int selection;
        mobilePhone.getHelp();

        while (!quit) {
            System.out.println("Enter Selection: ");
            selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    mobilePhone.getHelp();
                    break;
              case 1:
                    contacts.getContacts();
                    break;
              case 2:
                    createContact();
                    break;
              case 3:
                    readContact();
                    break;
//              case 4:
//                    getHelp();
//                    break;
//              case 5:
//                    getHelp();
//                    break;
            }
        }
    }

    public static void createContact() {
        System.out.print("Enter Contact Name: ");
        contacts.createContact(scanner.nextLine());
    }

    public static void readContact() {
        System.out.println("Search for: ");
        String searchTerm = scanner.nextLine();

        if (contacts.onFile(searchTerm)) {
            System.out.println("Found " + searchTerm);
        } else {
            System.out.println(searchTerm + " Not Found");
        }
    }

    public static class MobilePhone {

        public static void getHelp() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - Get Help");
            System.out.println("\t 1 - Show Contacts");
            System.out.println("\t 2 - Add Contact");
            System.out.println("\t 3 - Find Contact");
            System.out.println("\t 4 - DisplayOptions");
            System.out.println("\t 5 - DisplayOptions");
            System.out.println("\t 6 - DisplayOptions");
        }



        public static void updateContact() {}
        public static void destroyContact() {}
    }


}

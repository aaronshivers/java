package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List list = new List();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();

        while (!quit) {
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    list.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    editItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Display Options.");
        System.out.println("\t 1 - Display Items.");
        System.out.println("\t 2 - Add Item.");
        System.out.println("\t 3 - Edit Item.");
        System.out.println("\t 4 - Remove Item.");
        System.out.println("\t 5 - Search for Item.");
        System.out.println("\t 6 - Quit.");
    }

    public static void addItem() {
        System.out.print("Enter an item: ");
        list.addItem(scanner.nextLine());
    }

    public static void editItem() {
        System.out.print("Enter Item to Edit: ");
        String existingItem = scanner.nextLine();
        System.out.print("Edit " + existingItem + ": ");
        String newItem = scanner.nextLine();
        list.modifyItem(existingItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter Item to Remove: ");
        String item = scanner.nextLine();
        list.removeItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter an item to search for: ");
        String searchTerm = scanner.nextLine();

        if (list.onFile(searchTerm)) {
            System.out.println("Found " + searchTerm + " in the list");
        } else {
            System.out.println(searchTerm + " is not in the list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(list.getList());

        ArrayList<String> nextArray = new ArrayList<String>(list.getList());

        String[] myArray = new String[list.getList().size()];
        myArray = list.getList().toArray(myArray);
    }
}

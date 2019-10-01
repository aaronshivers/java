package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<String>();

        addToPlaylist(playlist, "test1");
        addToPlaylist(playlist, "test2");
        addToPlaylist(playlist, "test3");
        addToPlaylist(playlist, "test3");

//        printList(playlist);

        play(playlist);
    }

    private static void play(LinkedList songs) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = songs.listIterator();

        if (songs.isEmpty()) {
            System.out.println("Playlist is Empty");
            return;
        } else {
            System.out.println("Playing: " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("End of Playlist");
                    quit = true;
                    break;
                case 1:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Playing: " + listIterator.next());
                    } else {
                        System.out.println("Beginning of Playlist");
                        goingForward = true;
                    }

                    break;
                case 2:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Playing: " + listIterator.next());
                    } else {
                        System.out.println("End of Playlist");
                        goingForward = false;
                    }

                    break;
                case 3:
                    if (listIterator.hasNext()) {
                        System.out.println("Playing: " + listIterator.next());
                    } else {
                        System.out.println("End of Playlist");
                        goingForward = false;
                    }

                    break;
                case 4:
                    printMenu();
                    break;
            }
        }
    }

    private static boolean addToPlaylist(LinkedList<String> linkedList, String newSong) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newSong);

            if (comparison == 0) {
                System.out.println(newSong + " is already in the list.");
                return false;
            }
        }

        stringListIterator.add(newSong);
        return true;
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Now Playing " + iterator.next());
        }
    }

    private static void printMenu() {
        System.out.println("Available Actions:\npress");
        System.out.println("0: Quit");
        System.out.println("1: Previous Song");
        System.out.println("2: Next Song");
        System.out.println("3: Replay Song");
        System.out.println("4: Menu");
    }
}

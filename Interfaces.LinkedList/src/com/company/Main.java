package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("first album", "first test artist");
        album.addSong("first album - first song", 300);
        album.addSong("first album - second song", 400);
        album.addSong("first album - third song", 330);
        album.addSong("first album - fourth song", 320);
        album.addSong("first album - fifth song", 370);
        album.addSong("first album - sixth song", 420);
        album.addSong("first album - seventh song", 250);
        albums.add(album);

        album = new Album("second album", "second test artist");
        album.addSong("second album - first song", 300);
        album.addSong("second album - second song", 400);
        album.addSong("second album - third song", 330);
        album.addSong("second album - fourth song", 320);
        album.addSong("second album - fifth song", 370);
        album.addSong("second album - sixth song", 420);
        album.addSong("second album - seventh song", 250);
        albums.add(album);

        List<Song> playlist = new ArrayList<Song>();

        albums.get(0).addToPlayList("first album - first song", playlist);
        albums.get(0).addToPlayList("first album - second song", playlist);
        albums.get(0).addToPlayList("non existent song", playlist);
        albums.get(0).addToPlaylist(4, playlist);

        albums.get(1).addToPlayList("second album - seventh song", playlist);
        albums.get(1).addToPlayList("second album - third song", playlist);
        albums.get(1).addToPlayList("non existent song", playlist);
        albums.get(1).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(6, playlist);
        albums.get(1).addToPlaylist(2, playlist);

        play(playlist);
    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("Playlist is Empty");
        } else {
            System.out.println("Playing: " + listIterator.next().toString());
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
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("End of Playlist");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("Beginning of Playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Re-Playing: " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("Beginning of Playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Re-Playing: " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("End of Playlist");
                        }
                    }

                    break;

                case 4:
                    printList(playlist);
                    break;

                case 5:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Playing: " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Playing: " + listIterator.previous().toString());
                        }
                    }
                    break;

                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static boolean addToPlaylist(List<String> linkedList, String newSong) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newSong);

            if (comparison == 0) {
                System.out.println(newSong + " is already in the list.");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newSong);
                return true;
            }
        }

        stringListIterator.add(newSong);
        return true;
    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("====================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====================================");
    }

    private static void printMenu() {
        System.out.println("Available Actions:\npress");
        System.out.println("0: Quit");
        System.out.println("1: Next Song");
        System.out.println("2: Previous Song");
        System.out.println("3: Replay Song");
        System.out.println("4: Show Playlist");
        System.out.println("5: Remove Song");
        System.out.println("6: Menu");
    }
}

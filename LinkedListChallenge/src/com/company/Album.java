package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) != null) return false;

        this.songs.add(new Song(songTitle, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("Track: " + trackNumber + " Not Found");
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song foundSong = findSong(songTitle);
        if (foundSong != null) {
            playlist.add(foundSong);
            return true;
        }

        System.out.println("Song: " + songTitle + " Not Found");
        return false;
    }
}

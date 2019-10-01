package com.company;

import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
    }
}

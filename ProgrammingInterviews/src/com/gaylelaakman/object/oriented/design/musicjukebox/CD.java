package com.gaylelaakman.object.oriented.design.musicjukebox;

import java.util.Queue;

/**
 * Created by archithrapaka on 9/18/16.
 */
public class CD {
    private String title;
    private String artist;

    private Queue<Song> songs;

    public CD(){

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

     public Queue<Song> getSongs() {
        return songs;
    }

}

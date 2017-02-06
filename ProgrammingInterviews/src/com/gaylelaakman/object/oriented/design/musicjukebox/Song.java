package com.gaylelaakman.object.oriented.design.musicjukebox;

/**
 * Created by archithrapaka on 9/18/16.
 */
public class Song {
    private int id;
    private String title;
    private String artist;
    private String genre;

    public Song(int id , String title , String artist , String genre){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

}

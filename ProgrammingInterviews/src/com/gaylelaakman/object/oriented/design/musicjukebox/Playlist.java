package com.gaylelaakman.object.oriented.design.musicjukebox;

import java.util.Queue;

/**
 * Created by archithrapaka on 9/18/16.
 */
public class Playlist {
    private String name;
    private Queue<Song> songs;
    private Song song;

    public Playlist(String name){

    }
    public void addSongs(Song s){
        songs.add(s);
    }

    public Song playNextSong(Queue<Song> songs){
            return songs.peek();
    }
}

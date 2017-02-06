package com.gaylelaakman.object.oriented.design.musicjukebox;

import java.util.Queue;

/**
 * Created by archithrapaka on 9/18/16.
 */
public class CDPlayer {
           private Playlist playlist;
           private CD currentCD;

    public CDPlayer(CD currentCD , Playlist playlist){
        this.currentCD = currentCD;
        this.playlist = playlist;
    }

    // play top song on CD...
    public Song playSong(CD currentCD){
        Queue<Song> songsOnCd = currentCD.getSongs();
        return songsOnCd.peek();
    }
}

package com.gaylelaakman.object.oriented.design.musicjukebox;

import java.util.Set;

/**
 * Created by archithrapaka on 9/18/16.
 */
public class MusicJukeBox {
     private CDPlayer cdPlayer;
     private User user;
     private Set<CD> cds;

    public MusicJukeBox(CDPlayer cdPlayer , User user , Set<CD> cds){
        this.cdPlayer = cdPlayer;
        this.user = user;
        this.cds = cds;
    }
}

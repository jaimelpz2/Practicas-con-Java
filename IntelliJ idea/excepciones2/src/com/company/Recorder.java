package com.company;

import com.sun.xml.internal.ws.server.UnsupportedMediaException;

public class Recorder {

    String media;
    public Recorder(String mediaType){
        media=mediaType;
    }

    public void saveOn(String mediaType)throws UnsupportedMediaException{
        if(media.equals(mediaType)) {
            System.out.println("");
            System.out.println("Saving");
        }
        else {
            throw new UnsupportedMediaException();
        }
    }
}

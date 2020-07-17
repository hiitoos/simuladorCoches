package com.photograph;

public class Video extends Archivo {
    //String[] extPermitidas = {"mp4","mkv","avi"};

    public Video(String nombre, String ext, int peso) {
        super(nombre, ext, peso, new String[]{"mp4","mkv","avi"});
    }
}
package com.photograph;

public class Foto extends Archivo {
    //String[] extPermitidas = new String[]{"jpg","png","svg"};

    public Foto(String nombre, String ext, int peso) {
        super(nombre, ext, peso, new String[]{"jpg","png","svg"});
    }

}
package com.biblioteca;

public abstract class Publicaciones {
    String codigo;
    String titulo;
    int year;

    public Publicaciones(String codigo, String titulo, int year) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.year = year;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getYear() {
        return year;
    }
}

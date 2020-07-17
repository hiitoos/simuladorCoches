package com.biblioteca;

public class Revista extends Publicaciones {
    int numero;
    public Revista(String codigo, String titulo, int year, int numero) {
        super(codigo, titulo, year);
        this.numero = numero;
    }

    @Override
    public String toString() {
        String cadena = "Codigo: " + codigo + " - Titulo: " + titulo + " - Año publicacion: " + Integer.toString(year) + " - Numero: " + Integer.toString(numero);
        return cadena;
    }
}

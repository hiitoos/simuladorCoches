package com.biblioteca;

public class Libro extends Publicaciones implements Prestable {
    boolean prestado;
    public Libro(String codigo, String titulo, int year) {
        super(codigo, titulo, year);
        this.prestado=false;
    }

    @Override
    public String toString() {
        String cadena = "Codigo: " + codigo + " - Titulo: " + titulo + " - Año publicacion: " + Integer.toString(year) + " - Prestado: " + Boolean.toString(prestado);
        return cadena;
    }

    @Override
    public void prestar() {
        prestado = !prestado();
    }

    @Override
    public void devolver() {
        prestado = !prestado();
    }

    @Override
    public boolean prestado() {
        return prestado;
    }
}

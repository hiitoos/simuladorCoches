package com.biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Revista rev1 = new Revista("Codigo1", "Revista1", 1920, 1);
        System.out.println("Año revista: "+ rev1.getYear());
        System.out.println("Codigo revista: " + rev1.getCodigo());
        System.out.println(rev1.toString());

        Libro lib1 = new Libro("Codigo1", "Libro1", 1923);
        System.out.println("Año libro: "+ lib1.getYear());
        System.out.println("Codigo libro: " + lib1.getCodigo());
        System.out.println(lib1.toString());

        System.out.println("Estado de prestado: " + lib1.prestado());
        lib1.prestar();
        System.out.println("Estado de prestado: " + lib1.prestado());
        lib1.devolver();
        System.out.println("Estado de prestado: " + lib1.prestado());
    }
}

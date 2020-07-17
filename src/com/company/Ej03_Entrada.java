package com.company;

import java.util.Scanner;

public class Ej03_Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:\n");
        //Con el SPLIT lo que hacemos es una función que busque un carácter.
        String[] cadena = scanner.nextLine().split(" ");
        for (int i = 0; i < cadena.length; i++) {
            System.out.println(cadena[i]);
        }
    }
}

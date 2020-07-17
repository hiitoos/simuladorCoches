package com.company;

import java.util.Scanner;

public class Ej09_ASCII {
    public static void main(String[] args) {
        int diferencia = -32; //Diferencia en ascii de minus a mayus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String texto = scanner.nextLine();
        char[] cadena = texto.toCharArray();
        for (int i = 0; i < cadena.length; i++) {
            if ((cadena[i] > 96 && cadena[i] < 123) || ((cadena[i]>223 && (cadena[i]<254))))
                    System.out.print(Character.toString((char) cadena[i] + diferencia));
            else
                System.out.print(cadena[i]);
        }
    }
}

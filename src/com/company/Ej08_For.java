package com.company;

import java.util.Scanner;

public class Ej08_For {
    public static void main(String[] args) {
        //El usuario dice un numero y el programa lo multiplica
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número para la tabla multiplicar");
        int numero = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
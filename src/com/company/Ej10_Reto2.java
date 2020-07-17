package com.company;

import java.util.Scanner;

public class Ej10_Reto2 {
    public static void main(String[] args) {
        //Programa 1
        int i = 1;
        int aprobados = 0;
        int suspendidos = 0;
        int introducidoInt;
        String introducidoString;
        Scanner entrada = new Scanner(System.in);

        while (i <= 50) {
            System.out.println(i + " ");
            i++;
        }

        //Programa 2
        int[] notas = new int[10];
        for (int j = 0; j < notas.length; j++) {
            System.out.println("Escribe la nota");
            notas[j] = entrada.nextInt();
            if (notas[j] >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
        }
        System.out.println("Aprobados: " + aprobados + "\nSupendidos: " + suspendidos);

        //Programa 3
        do {
            System.out.println("Introduce un número entre 0 y 9999");
            introducidoInt = entrada.nextInt();
            introducidoInt = Math.abs(introducidoInt);
            introducidoString = Integer.toString(introducidoInt);
            if (introducidoString.length() == 1)
                System.out.println("Tiene una longitud de " + introducidoString.length() + " carácter.");
            else
                System.out.println("Tiene una longitud de " + introducidoString.length() + " carácteres.");
        } while ((introducidoInt != 0) && (introducidoInt < 9999));
    }
}

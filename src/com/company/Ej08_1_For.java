package com.company;

public class Ej08_1_For {

    public static void main(String[] args) {
        System.out.println("------------------------------------ Ahora todas las tablas de multiplicar ------------------------------------");
        for (int j = 0; j <= 10; j++) {
            if (j<10)
                System.out.println("  ------------- ");
            else
                System.out.println("  -------------- ");
            System.out.println("|| Tabla del " + j + " ||");
            if (j<10)
                System.out.println("  ------------- ");
            else
                System.out.println("  -------------- ");
            for (int x = 0; x <= 10; x++) {
                System.out.print(j + " x " + x + " = " + (j * x) + "\n");
            }
        }
    }
}
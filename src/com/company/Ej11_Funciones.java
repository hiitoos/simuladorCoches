package com.company;

import java.util.Scanner;

public class Ej11_Funciones {
    public static void main(String[] args) {
        short choice;
        double num1=0, num2=0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Qué desea calcular?\n 1.- Suma\n 2.- Resta\n 3.- Multiplicación\n 4.- División\n 5.- Potencia\n 6.- Raíz cuadrada\n 7.- Otro tipo de raíz\n 0.- Salir");
            choice = scanner.nextShort();
            if (choice != 0) {
                if ((choice != 5) && (choice != 6)) {
                    System.out.println("Introduce número 1: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce número 2: ");
                    num2 = scanner.nextDouble();
                }
            }

            switch (choice) {
                case 1 -> System.out.println("El resultado es: " + suma(num1, num2));
                case 2 -> System.out.println("El resultado es: " + resta(num1, num2));
                case 3 -> System.out.println("El resultado es: " + multiplicaion(num1, num2));
                case 4 -> System.out.println("El resultado es: " + division(num1, num2));
                case 5 -> System.out.println("El resultado es: " + potencia(num1, num2));
                case 6 -> System.out.println("El resultado es: " + raiz(num1));
                case 7 -> System.out.println("El resultado es: " + raizOther(num1, num2));
                case 0 -> System.out.println("Hasta luego.");
                default -> {
                    System.out.println("Valor erroneo\n");
                    System.exit(0);
                }
            }
        } while (choice != 0);
    }

    public static double suma(double num1, double num2) {
        return num1+num2;
    }

    public static double resta(double num1, double num2) {
        return num1-num2;
    }

    public static double multiplicaion(double num1, double num2) {
        return num1*num2;
    }

    public static double division(double num1, double num2) {
        double resultado;
            if (num2!=0)
                resultado = num1 / num2;
            else
                resultado = 0;

        return resultado;
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double raiz(double a) {
        return Math.sqrt(a);
    }

    public static double raizOther(double num1, double num2) {
        return Math.pow(num1, (1 / num2));
    }
}

package com.company;

import java.util.Scanner;

public class Ej06_While {
    static final float ceroAbsoluto = -273.15f;
    static Scanner scanner = new Scanner(System.in);
    static float total, valor;

    public static void main(String[] args) {
        short choice;
        System.out.println("¿Qué desea calcular?\n 1.- Celsius a Kelvin\n 2.- Kelvin a Celsius\n 0.- Salir");
        choice = scanner.nextShort();
        while (choice != 0) {
            switch (choice) {
                case 1 -> conversionCelsiusKelvin();
                case 2 -> conversionKelvinCelcius();
                default -> System.out.println("Valor erroneo");
            }
            System.out.println("¿Qué desea calcular?\n 1.- Celsius a Kelvin\n 2.- Kelvin a Celsius\n 0.- Salir");
            choice = scanner.nextShort();
        }
        System.out.println("Hasta luego\n");
    }


    public static void conversionCelsiusKelvin() {
        System.out.println("Introduzca el valor\n");
        valor = scanner.nextFloat();
        if (valor < ceroAbsoluto) {
            System.out.println("Error, temperatura por debajo del 0 absoluto");
            System.exit(0);
        }
        total = valor - ceroAbsoluto;
        System.out.println("El resultado de la conversión es: " + total);
    }

    public static void conversionKelvinCelcius() {
        System.out.println("Introduzca el valor\n");
        valor = scanner.nextFloat();
        total = valor + ceroAbsoluto;
        System.out.println("El resultado de la conversión es: " + total);
    }
}

package com.company;

import java.util.Scanner;

public class Ej05_IF {
    static final float ceroAbsoluto = -273.15f;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Input
        System.out.println("¿Qué desea calcular?\n 1.- Celsius a Kelvin\n 2.- Kelvin a Celsius");
        short choice = scanner.nextShort();
        switch (choice) {
            case 1 -> conversionCelsiusKelvin();
            case 2 -> conversionKelvinCelcius();
            default -> {
                System.out.println("Valor erroneo\n");
                System.exit(0);
            }
        }
    }

    public static void conversionCelsiusKelvin(){
        float total, valor;
        System.out.println("Introduzca el valor\n");
        valor = scanner.nextFloat();
        if (valor < ceroAbsoluto) {
            System.out.println("Error, temperatura por debajo del 0 absoluto");
            System.exit(0);
        }
        total = valor - ceroAbsoluto;
        System.out.println("El resultado de la conversión es: " + total);
    }

    public static void conversionKelvinCelcius(){
        float total, valor;
        System.out.println("Introduzca el valor\n");
        valor = scanner.nextFloat();
        total = valor + ceroAbsoluto;
        System.out.println("El resultado de la conversión es: " + total);
    }
}

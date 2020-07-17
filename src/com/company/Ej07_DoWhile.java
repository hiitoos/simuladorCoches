package com.company;

import java.util.Scanner;

public class Ej07_DoWhile {
    public static void main(String[] args) {
        float celsius;
        float kelvin;
        final float CERO_ABSOLUTO_CELCIUS = -273.15f;
        String mensaje;
        String terminar;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce la Temperatura: ");
            celsius = teclado.nextFloat();
            if( celsius >= CERO_ABSOLUTO_CELCIUS ) {
                kelvin = celsius + (-CERO_ABSOLUTO_CELCIUS);
                mensaje = "Celcius: " + celsius + " - Kelvin: " + kelvin;
            } else {
                mensaje = "El input tiene un valor irreal";
            }
            System.out.println(mensaje);
            System.out.println("¿Has terminado de calcular ? (Y/N)" );
            terminar = teclado.next();
        } while(terminar.equals("n") || (terminar.equals("N")));
    }
}

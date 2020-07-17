package com.company;

public class Ej04_arrays {

    public static void main(String[] args) {
        String dia1 = "Lunes";
        String dia2 = "Martes";
        String dia3 = "Miercoles";
        String[] diasSemana = new String[3];
        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miercoles";
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(diasSemana[i]);
        }

    }

}

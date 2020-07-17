package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej12_3Raya {
    static char[][] tablero = new char[3][3];

    public static void main(String[] args) {
        int fila;
        int columna;
        int numerosTotales=0;
        Scanner scanner = new Scanner(System.in);
        for (char[] value : tablero) {
            Arrays.fill(value, ' ');
        }
        boolean win;
        System.out.println("Tablero 3 en Raya");
        do {
            char letra;
            if (numerosTotales % 2 == 0) letra = 'X';
            else letra = 'O';
            System.out.println("Introduce posición para " + letra + " (Fila)");
            fila = scanner.nextInt();
            System.out.println("Introduce posición para " + letra + "  (Columna)");
            columna = scanner.nextInt();

            if (tablero[fila - 1][columna - 1] == ' ') {
                numerosTotales++;
                tablero[fila - 1][columna - 1] = letra;
            } else
                System.out.println("--------------------¡¡¡Puesto ocupado!!! --------------------");


            for (char[] chars : tablero) {
                for (char aChar : chars) {
                    System.out.print("  |----" + aChar + "----|");
                }
                System.out.println();
            }
            System.out.println("NUMERO JUGADAS " + numerosTotales);
            win = comprobacion();
        } while ((numerosTotales < 9) &&  (!win));
        if (numerosTotales == 9) {
            System.out.println("--------------------¡EMPATE!--------------------");
        }
    }

    public static boolean comprobacion() {
        boolean win = false;
        //Comprobación horizontales
        for (char[] chars : tablero) {
            int j = 0;
            if (chars[j] != ' ') {
                if ((chars[j] == chars[j + 1]) && (chars[j] == chars[j + 2])) {
                    win = true;
                    System.out.println("--------------------Gana el jugador " + chars[j] + " --------------------");
                    System.exit(0);
                }
            }
        }
        //Comprobación verticales
        for (int j = 0; j < tablero.length; j++) {
            int i = 0;
            if (tablero[i][j] != ' ') {
                if ((tablero[i][j] == tablero[i + 1][j]) && (tablero[i][j] == tablero[i + 2][j])) {
                    win = true;
                    System.out.println("--------------------Gana el jugador " + tablero[i][j] + " --------------------");
                    System.exit(0);
                }
            }
        }
        //Comprobación diagonal 1.1-3.3
        if (tablero[0][0] != ' ') {
            if ((tablero[0][0] == tablero[1][1]) && (tablero[0][0] == tablero[2][2])) {
                win = true;
                System.out.println("--------------------Gana el jugador " + tablero[0][0] + " --------------------");
                System.exit(0);

            }
        }

        //Comprobación diagonal 3.1-1.3
        if (tablero[2][0] != ' ') {
            if ((tablero[2][0] == tablero[1][1]) && (tablero[2][0] == tablero[0][2])) {
                win = true;
                System.out.println("--------------------Gana el jugador " + tablero[2][0] + " --------------------");
                System.exit(0);

            }
        }
        return win;
    }
}

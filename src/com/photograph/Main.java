package com.photograph;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Camara cam;

    public static void main(String[] args) {
        System.out.println("Modelo de cámara:");
        String modelo = scanner.next();
        System.out.println("Capacidad de batería:");
        int cap = scanner.nextInt();
        System.out.println("Tamaño de tarjeta SD:");
        int sdSize = scanner.nextInt();
        cam = new Camara(modelo, cap, sdSize);

        short choice;
        System.out.println("¿Qué desea hacer? (" + ((cam.getBateriaRestante()*100)/cam.getCapacidadBateria()) + "%)\n 1.- Crear\n 2.- Eliminar archivo\n 3.- Ver capacidad\n 4.- Ver archivos\n 0.- Salir");
        choice = scanner.nextShort();
        while (choice != 0) {
            switch (choice) {
                case 1 -> cam.hacerArchivo();
                case 2 -> {
                    System.out.println("¿Qué archivo quieres elminar?\n0- Atrás");
                    cam.listadoDeFotos(true);
                    int elec = scanner.nextInt();
                    if (elec > 0)
                        cam.eliminarFoto(elec-1);
                }

                case 3 -> System.out.println("Quedan libres: " + cam.getMemLib() + " del total de " + cam.getMemTot());
                case 4 -> {
                    System.out.println("|----------Mostrando fotos----------|");
                    cam.listadoDeFotos(false);
                }
                case 5 -> cam.capacidadBateria = cap;
                default -> System.out.println("Valor erroneo");
            }
            if ((cam.capacidadBateria >= 100) && (cam.getMemLib() >= 1)) {
                System.out.println("¿Qué desea hacer? (" + ((cam.getBateriaRestante()*100)/cam.getCapacidadBateria()) + "%)\n 1.- Crear\n 2.- Eliminar archivo\n 3.- Ver capacidad\n 4.- Ver archivo\n 0.- Salir");
            }
            if (cam.getMemLib() == 0) {
                System.out.println("¿Qué desea hacer? (" + ((cam.getBateriaRestante()*100)/cam.getCapacidadBateria()) + "%)\n --No hay espacio en SD--\n 2.- Eliminar archivo\n 3.- Ver capacidad\n 4.- Ver archivos\n 0.- Salir");
            }
            if (cam.capacidadBateria < 100) {
                System.out.println("¿Qué desea hacer? (" + ((cam.getBateriaRestante()*100)/cam.getCapacidadBateria()) + "%)\n 5- Cargar batería\n 0.- Salir");
            }
            choice = scanner.nextShort();
        }
        System.out.println("Hasta luego\n");
    }
}


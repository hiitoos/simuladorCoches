package com.objects;

import java.util.ArrayList;
import java.util.Scanner;

class Camaras {
    // Atributos
    String modelo;
    int capacidadBateria;
    TarjetaSD sd;

    public Camaras(String modelo, int bateria, int memoria) {
        this.modelo = modelo;
        this.capacidadBateria = bateria;
        this.sd = new TarjetaSD(memoria, memoria);
    }

    // Metodos
    public void hacerFoto() {
        if(capacidadBateria>100) {
            sd.addArchivo();
            capacidadBateria -= 100;
        }
        else {
            System.out.println("Cámara apagada");
            capacidadBateria=0;
        }
    }

    public void listadoDeFotos() {
        if (sd.getArchivos().size()>0) {
            for (int i = 0; i < sd.getArchivos().size(); i++) {
                System.out.println(sd.getArchivos().get(i).nombre);
            }
        }
        else System.out.println("No hay fotos para mostrar");
    }

    public void eliminarFoto(int position) {
        sd.borrarArchivo(position);
    }

    public int getMemLib(){
        return sd.getMemoriaLibre();
    }

    public int getMemTot(){
        return sd.getMemoriaTotal();
    }
}

class TarjetaSD {
    int memoriaTotal;
    int memoriaLibre;
    ArrayList<Foto> archivos;

    public TarjetaSD(int memTot, int memLib) {
        this.memoriaTotal = memTot;
        this.memoriaLibre = memLib;
        this.archivos = new ArrayList<>();
    }

    public void addArchivo() {
        if(memoriaLibre>0) {
            archivos.add(new Foto("Foto n " + this.archivos.size(), 1));
            memoriaLibre--;
            System.out.println("----------");
        }
        else System.out.println("No hay espacio libre");
    }

    public void borrarArchivo(int position) {
        archivos.remove(position);
        memoriaLibre++;
    }

    public ArrayList<Foto> getArchivos() {
        return archivos;
    }

    public int getMemoriaTotal() {
        return memoriaTotal;
    }

    public int getMemoriaLibre() {
        return memoriaLibre;
    }
}

class Foto {
    String nombre;
    int size;

    public Foto(String nombre, int size) {
        this.nombre = nombre;
        this.size = size;
    }
}

public class Ej02_Foto {
    static Scanner scanner = new Scanner(System.in);
    static Camaras cam;

    public static void main(String[] args) {
        System.out.println("Modelo de cámara:");
        String modelo = scanner.next();
        System.out.println("Capacidad de batería:");
        int cap = scanner.nextInt();
        System.out.println("Tamaño de tarjeta SD:");
        int sdSize = scanner.nextInt();
        cam = new Camaras(modelo, cap, sdSize);

        short choice;
        System.out.println("¿Qué desea hacer?\n 1.- Hacer foto\n 2.- Eliminar foto\n 3.- Ver capacidad\n 4.- Ver fotos\n 0.- Salir");
        choice = scanner.nextShort();
        while (choice != 0) {
            switch (choice) {
                case 1 ->cam.hacerFoto();
                case 2 -> {
                    System.out.println("¿Qué foto quieres elminar?");
                    cam.listadoDeFotos();
                    cam.eliminarFoto(scanner.nextInt());
                }
                case 3 ->System.out.println("Quedan libres: " + cam.getMemLib() + " del total de " + cam.getMemTot());
                case 4 ->{
                    System.out.println("|----------Mostrando fotos----------|");
                    cam.listadoDeFotos();
                }
                case 5->cam.capacidadBateria=cap;
                default -> System.out.println("Valor erroneo");
            }
            if ((cam.capacidadBateria>=100) && (cam.getMemLib()>=1)){
                System.out.println("¿Qué desea hacer?\n 1.- Hacer foto\n 2.- Eliminar foto\n 3.- Ver capacidad\n 4.- Ver fotos\n 0.- Salir");
            }
            if (cam.getMemLib()==0){
                System.out.println("¿Qué desea hacer?\n --No hay espacio en SD--\n 2.- Eliminar foto\n 3.- Ver capacidad\n 4.- Ver fotos\n 0.- Salir");
            }
            if (cam.capacidadBateria<100) {
                System.out.println("¿Qué desea hacer?\n 5- Cargar batería\n 0.- Salir");
            }
            choice = scanner.nextShort();
        }
        System.out.println("Hasta luego\n");
    }
}
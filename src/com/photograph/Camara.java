package com.photograph;

import java.util.Scanner;

class Camara {
    // Atributos
    String modelo;
    int capacidadBateria;
    int bateriaRestante;
    TarjetaSD sd;

    public Camara(String modelo, int bateria, int memoria) {
        this.modelo = modelo;
        this.capacidadBateria = bateria;
        setBateriaRestante(bateria);
        this.sd = new TarjetaSD(memoria, memoria);
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void hacerArchivo() {
        String nombre;
        String ext;
        System.out.println("¿Qué quieres añadir?\n 1.- Foto\n 2.- Video");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Introduce el nombre del archivo:");
        nombre = scanner.next();
        System.out.println("Introduce el tipo de la extensión:");
        ext = scanner.next();
        texto(choice, nombre, ext);
    }

    public void texto(int choice, String nombre, String ext) {
        if ((choice == 1) && (sd.memoriaLibre > 0)) {
            sd.addArchivo(new Foto(nombre, ext, 1));
            this.bateriaRestante -= 100;
            System.out.println("----------");
        }
        else if ((choice == 2) && (sd.memoriaLibre >= 2)) {
            sd.addArchivo(new Video(nombre, ext, 2));
            this.bateriaRestante -= 200;
            System.out.println("----------");
        }
        else System.out.println("No hay espacio libre");
    }

    public int getBateriaRestante() {
        return bateriaRestante;
    }

    public void setBateriaRestante(int bateriaRestante) {
        this.bateriaRestante = bateriaRestante;
    }

    public void listadoDeFotos(boolean eliminar) {
        String valorExtension;
        if (sd.getArchivos().size() > 0) {
            for (int i = 0; i < sd.getArchivos().size(); i++) {
                if (!eliminar) {
                    valorExtension = sd.getArchivos().get(i).getExt();
                    if (!valorExtension.equals(""))
                        System.out.println((i + 1) + ".- " + sd.getArchivos().get(i).nombre + "." + sd.getArchivos().get(i).getExt() + "\n");
                } else
                    System.out.println((i + 1) + ".- " + sd.getArchivos().get(i).nombre + "." + sd.getArchivos().get(i).getExt());
            }
        } else System.out.println("No hay fotos para mostrar\n");
    }

    public void eliminarFoto(int position) {
        sd.borrarArchivo(position);
    }

    public int getMemLib() {
        return sd.getMemoriaLibre();
    }

    public int getMemTot() {
        return sd.getMemoriaTotal();
    }
}
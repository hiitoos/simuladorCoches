package com.objects;

class Camara {
    //Atributos
    String modelo;
    int memoriaDisponible;
    int memoriaTotal = 10;
    String[] galeria;
    int capacidad;


    //Constructor
    public Camara(String modelo, int memoriaDisponible) {
        this.modelo = modelo;
        this.memoriaDisponible = memoriaDisponible;
        this.galeria = new String[memoriaDisponible];
    }
    //Constructor
    public Camara(String modelo, int memoriaDisponible, int capacidad) {
        this.modelo = modelo;
        this.memoriaDisponible = memoriaDisponible;
        this.galeria = new String[memoriaDisponible];
        this.capacidad = capacidad;
    }

    //Metodos
    void hacerFoto(String nombreFoto) {
        if (this.memoriaDisponible > 0) {
            this.memoriaDisponible--;
            System.out.println("Patata! - " + nombreFoto + ".jpg");
            System.out.println("Te quedan: " + this.memoriaDisponible + " fotos");
            this.galeria[memoriaTotal-memoriaDisponible-1]= nombreFoto+".jpg";
        } else System.out.println("Sin espacio disponible");
    }
    //For enhanced para arrays --> sería un ForEach en otro lenguaje (Tipo dato del aray variable : longitudarray)
    void verGaleria(){
        for (String item : this.galeria) {
            System.out.println(item);
        }
    }
}

public class E01_Clases {
    public static void main(String[] args) {
        Camara seat = new Camara("nikon", 10);
        for (int i = 0; i <= 10; i++) {
            seat.hacerFoto(Integer.toString(i+1));
        }
        seat.verGaleria();

        Camara cons2 = new Camara("canon", 14, 3000);
    }
}


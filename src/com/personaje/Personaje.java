package com.personaje;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Personaje {
    String nombre;
    ArrayList<Item> inventario;
    Estadisticas stad;
    Equipamiento equipo;
    DecimalFormat df = new DecimalFormat("#,00");


    public Personaje() {
        this.creacionPersonaje();
    }

    void atacar(Personaje pJatacado) {
        stad.fuerza -= stad.velocidad*0.3;
            if (pJatacado.stad.defensa < stad.fuerza) {
                pJatacado.stad.salud -= (stad.fuerza - pJatacado.stad.defensa);
                pJatacado.stad.defensa = 0;
                pJatacado.equipo.mejora.put("Casco", 0);
                pJatacado.equipo.mejora.put("Armadura", 0);

            } else
                pJatacado.stad.defensa -= stad.fuerza;
        System.out.println("Ha realizado una fuerza de: " + df.format(stad.fuerza));
    }

    private void creacionPersonaje(){
        Scanner scan = new Scanner(System.in);
        int casco, armadura, fuerza, tipo;
        System.out.println("--------------------------------");
        System.out.println("Introduce el nombre del jugador:");
        this.nombre = scan.next();
        System.out.println("Tipo de personaje\n1.- Mago\n2.- Picaro\n3.- Tanque");
        tipo = scan.nextInt();
        System.out.print("Introduce el valor del casco: ");
        casco = scan.nextInt();
        System.out.print("\nIntroduce el valor de la armadura: ");
        armadura = scan.nextInt();
        System.out.print("\nIntroduce el valor del arma: ");
        fuerza = scan.nextInt();

        if (tipo == 1) //Mago
            this.stad = new Estadisticas(100, 30, 90, 4);

        else {
            if (tipo == 2) //Picaro
                this.stad = new Estadisticas(70, 90, 120, 6);
            else //Tanque
                this.stad = new Estadisticas(130,60,120,2);
        }
        this.equipo = new Equipamiento(casco, armadura, fuerza);
        this.stad.fuerza += this.equipo.mejora.get("Fuerza");
        this.stad.defensa += this.equipo.mejora.get("Armadura") + this.equipo.mejora.get("Casco");
    }
}

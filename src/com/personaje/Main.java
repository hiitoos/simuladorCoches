package com.personaje;

/*class Juego{
    public int turno = 0;

    public void combate(){
        //Empieza turno
        //J1 elige mov
        //J2 elige mov
        //desenlace (mas Velo actua primero)
        //turno ++
    }

}*/

import java.text.DecimalFormat;

public class Main {
    static Personaje p1;
    static Personaje p2;
    static boolean turno;
    static DecimalFormat df = new DecimalFormat("#,00");

    public static void main(String[] args) {
        p1 = new Personaje();
        p2 = new Personaje();
        setTurno(true);
        partida();
/*      int j1, j2;
        System.out.println("Jugador 1, ¿qué deseas hacer?\n1.- Atacar\n2.- Equipar\n3.- Huir\n0.- Salir");
        Scanner scanner = new Scanner(System.in);
        j1 = scanner.nextInt();
        if (j1==1) p1.atacar(p2);
        else {
            System.out.println("¿Qué deseas equipar?\n1.- Daño\n2.- Vida\n3.- Armadura\n4.- Velocidad\n0- Salir");
        }*/
    }



    public static void partida(){
        System.out.println("---------- EMPIEZA LA PARTIDA ----------");
        System.out.println(p1.nombre + ": " + df.format(p1.stad.salud) + "hp" + " Defensa: " + p1.stad.defensa);
        System.out.println(p2.nombre + ": " + df.format(p2.stad.salud) + "hp" + " Defensa: " + p2.stad.defensa);
        System.out.println("--------------------------------");
        while (p1.stad.salud > 0 && p2.stad.salud > 0) {
            if(isTurno()){
                p1.atacar(p2);
                System.out.println("Ha atacado: " + p1.nombre);
                setTurno(false);
            }
            else {
                p2.atacar(p1);
                System.out.println("Ha atacado: " + p2.nombre);
                setTurno(true);
            }
            imprimir();
        }
    }
    public static boolean isTurno() {
        return turno;
    }

    public static void setTurno(boolean turno) {
        Main.turno = turno;
    }

    public static void imprimir(){
        if (p1.stad.salud>0)
            System.out.println(p1.nombre + ": " + p1.stad.salud + "hp" + " Defensa: " + p1.stad.defensa);
        else
            System.out.println("El jugador: " + p1.nombre + " ha muerto");
        if (p2.stad.salud>0)
            System.out.println(p2.nombre + ": " + p2.stad.salud + "hp" + " Defensa: " + p2.stad.defensa);
        else
            System.out.println("El jugador " + p2.nombre + " ha muerto");
        System.out.println("--------------------------------");
    }
}

package com.empleado;

public class Main {
    public static void main(String[] args) {
        Repartidor repartidor1 = new Repartidor("Adrian", 26, 1900);
        Repartidor repartidor2 = new Repartidor("Carlos", 24, 2000);

        System.out.println(repartidor1.toString()); //Sin zona
        System.out.println(repartidor2.toString()); //Sin zona

        repartidor1.setZona("Zona 3");
        repartidor2.setZona("Zona 3");
        System.out.println(repartidor2.toString()); //Con zona

        repartidor2.setEdad(25);
        System.out.println(repartidor2.toString()); //Con zona

        repartidor2.setEdad(26);
        System.out.println(repartidor2.toString()); //Con zona

        System.out.println(repartidor1.toString()); //Con zona
        System.out.println(repartidor2.toString()); //Con zona

        System.out.println("--------------------------------------------");
/*
        Comercial comercial1 = new Comercial("Jose", 29, 1900);
        //Comercial comercial2 = new Comercial("Pedro", 30, 1900);

        System.out.println(comercial1.toString()); //Sin comision
        //System.out.println(comercial2.toString()); //Sin comision

        comercial1.setComision(201);
        //comercial2.setComision(201);

        System.out.println(comercial1.toString()); //Con comision
       // System.out.println(comercial2.toString()); //Con comision

        comercial1.setEdad(31);
        System.out.println(comercial1.toString()); //Con comision

*/
    }
}

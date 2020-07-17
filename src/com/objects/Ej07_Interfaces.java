package com.objects;

class Animales {
    String especie;

    void Comer() {
        System.out.println("Comer");
    }
}

interface Mascota {  //Las interfaces tienen que tener inicializadas las variables en caso de tener (no suelen)
    String nombre = "";
    String amo = "";

    void darPatita();
}

///////Las CLASES atributos y algun metodo e INTEFACES acciones(metodos)
/////// Las INTERFACES estan pensadas para heredar. Se pueden extender entre ellas
interface TrucosLvl1 {
    void sentarse();
    void tumbarse();
}

interface TrucosLvl2 extends TrucosLvl1{
    void hacerPino();
    void girar();
}

class Perros extends Animales implements Mascota, TrucosLvl2 { //Al implementarlo lo que hace es crearte las funciones y luego las desarrollas
    @Override
    public void darPatita() {
        System.out.println("Dar pata");
    }

    @Override
    public void sentarse() {
        System.out.println("Sentarse");
    }

    @Override
    public void tumbarse() {
        System.out.println("Tumbarse");
    }

    @Override
    public void hacerPino() {
        System.out.println("Haciendo el pino");
    }

    @Override
    public void girar() {
        System.out.println("Girando");
    }

}

class Gato extends Animales implements Mascota {
    @Override
    public void darPatita() {

    }
}

class Conejo extends Animales implements Mascota {
    @Override
    public void darPatita() {

    }
}

public class Ej07_Interfaces {
    public static void main(String[] args) {
        Perros perro = new Perros();
        perro.darPatita();
    }
}

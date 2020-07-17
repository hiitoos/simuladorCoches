package com.objects;

abstract class SerVivo{

}

abstract class Animal extends SerVivo{ //El abstract impide que inicialice la clase, da error
    String especie;
    void comer (){
        System.out.println("Comiendo");
    }
}

class Perro extends Animal{

}

public class Ej06_Abstract {
    public static void main(String[] args) {
        //Animal animal = new Animal(); //Da error, la clase Abstract solo permite instanciarlo, para crear la clase hijos
    }
}

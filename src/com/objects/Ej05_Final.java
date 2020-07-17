package com.objects;

class A{
    String a;
    String b;

    final void MA(){ //El final hace que no puedas cambiar el valor, es una constante
        System.out.println("MA");
    }

    void MB(){
        System.out.println("MB");
    }
}

class B extends A{
   /* @Override //Sobreescribir
    void MA() { //Se queja porque no puedes cambiarla
        super.MA();
    }*/

    @Override
    void MB() {
        super.MB();
    }
}

public class Ej05_Final {

}

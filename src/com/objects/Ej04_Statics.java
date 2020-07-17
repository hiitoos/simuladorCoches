package com.objects;

class Calculadora{

    static int suma(int a, int b){
        System.out.println(a+b);
        return (a+b);
    }

    //Si colocamos delante de la funcion la palabra STATIC no es necesario luego instanciar el "new"
    //Utiliza un espacio unico en memoria
}


public class Ej04_Statics {
    public static void main(String[] args) {
        Calculadora calculadora;// = new Calculadora(); --> como "suma" es static no es necesario hace el "new"
        Calculadora.suma(1,2);

    }
}

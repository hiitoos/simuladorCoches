package com.objects;

//POCO objeto sencillo, variable, constructor, get/set
class Coche{
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public Coche(String modelo) {
        this.modelo = modelo;
    }
}

public class Ej02_Composicion {

}

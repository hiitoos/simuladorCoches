package com.personaje;

import java.util.Map;

public class Item {
    String nombre;
    String descripcion;
    Map<String, Integer> mejora;

    public Item(String nombre, String descripcion, Map<String, Integer> mejora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.mejora = mejora;
    }
}

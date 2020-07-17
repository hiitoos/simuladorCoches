package com.personaje;
import java.util.HashMap;
import java.util.Map;

public class Equipamiento {
    public Map<String, Integer> mejora = new HashMap<>();
    Item helmet;
    Item peto;
    Item weapon;

    public Equipamiento(int casco, int armadura, int arma) {
        this.mejora.put("Casco", casco);
        this.helmet = new Item ("casco", "Elemento de protección que proporciona armadura en cabeza", this.mejora);
        this.mejora.put("Armadura", armadura);
        this.peto = new Item ("armadura", "Elemento de protección que proporciona armadura en pecho", this.mejora);
        this.mejora.put("Fuerza", arma);
        this.weapon = new Item ("arma", "Elemento de protección que proporciona fuerza", this.mejora);
    }

}

package com.simuladorCoches;

public class Rueda {
    private int peso;
    private String modelo;
    private double fiabilidad;

    public Rueda(String modelo, int peso, double fiabilidad) {
        setPeso(peso);
        setModelo(modelo);
        setFiabilidad(fiabilidad);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public double getFiabilidad() {
        return fiabilidad;
    }

    public void setFiabilidad(double fiabilidad) {
        this.fiabilidad = fiabilidad/100;
    }
}

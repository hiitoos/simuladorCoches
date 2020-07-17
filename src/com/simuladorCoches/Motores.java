package com.simuladorCoches;

public class Motores {
    private int fuerza;
    private double peso;
    private String modelo;
    private double consumo;

    public Motores(String modelo, int fuerza, double peso, double consumo) {
        setFuerza(fuerza);
        setPeso(peso);
        setModelo(modelo);
        setConsumo(consumo/1000);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}

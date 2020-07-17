package com.simuladorCoches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

abstract class Coche implements Comparable<Coche>{
    private String marca;
    private double velocidadMax;
    final double KMH2MS = 3.6;
    private double recorrido;
    private double peso;
    private double aceleracion;
    private Motores motor;
    private Rueda rueda;
    private double velocidadMomento;
    private int capDeposito;
    private double depositoActu;

    public Coche(String marca, double velocidadMax, double peso, int deposito) {
        setMarca(marca);
        setVelocidadMax(velocidadMax);
        setPeso(peso);
        setDepositoActu(deposito);
        setCapDeposito(deposito);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax / KMH2MS;
    }

    public double getRecorrido() {
        return recorrido / 1000;
    }

    public void setRecorrido(double velocidad, double aceleracion) {
        this.recorrido += recorrido + velocidad + (0.5 * aceleracion);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Motores getMotor() {
        return motor;
    }

    public void setMotor(Motores motor) {
        this.motor = motor;
    }

    public Rueda getRueda() {
        return rueda;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    public double getVelocidadMomento() {
        return velocidadMomento;
    }

    public void setVelocidadMomento(double velocidadMomento) {
        this.velocidadMomento = velocidadMomento;
    }

    public int getCapDeposito() {
        return capDeposito;
    }

    public void setCapDeposito(int capDeposito) {
        this.capDeposito = capDeposito;
    }

    public double getDepositoActu() {
        return depositoActu;
    }

    public void setDepositoActu(double depositoActu) {
        this.depositoActu = depositoActu;
    }

    public void correr() {
        if (this.depositoActu > 0) {
            //System.out.println(this.getDepositoActu());
            this.setVelocidadMomento(this.getVelocidadMomento() + this.getAceleracion());

            if (this.getVelocidadMax() <= this.getVelocidadMomento())
                this.setVelocidadMomento(this.getVelocidadMax());

            this.setRecorrido(this.getVelocidadMomento(), this.getAceleracion());
            this.setDepositoActu(this.getDepositoActu() - (this.getVelocidadMomento() * motor.getConsumo()));
        }
        else{
            System.out.println(this.getMarca() + " sin combustible, rellenando...");
            this.setDepositoActu(this.getCapDeposito());
        }
    }

    @Override
    public int compareTo(Coche o) {
        if (getRecorrido() < o.getRecorrido()) {
            return -1;
        }
        if (getRecorrido() > o.getRecorrido()) {
            return 1;
        }
        return 0;
    }

    public void orden(ArrayList<Coche> coches){
        coches.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                return o2.compareTo(o1);
            }
        });

    }

}

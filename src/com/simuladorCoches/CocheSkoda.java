package com.simuladorCoches;

public class CocheSkoda extends Coche {

    public CocheSkoda(String marca, double velocidadMax, double peso, int deposito) {
        super(marca, velocidadMax, peso, deposito);
        this.setMotor(new Motores("M3", 4000, 250, 9.1));
        this.setRueda(new Rueda("Goodyear", 30, 99.99));
        setPeso(peso + this.getMotor().getPeso() + this.getRueda().getPeso());
        setAceleracion(this.getMotor().getFuerza()/this.getPeso());
        setVelocidadMax(velocidadMax);
        setVelocidadMomento(0);
    }
}
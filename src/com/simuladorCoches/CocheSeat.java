package com.simuladorCoches;

public class CocheSeat extends Coche {

    public CocheSeat(String marca, double velocidadMax, double peso, int deposito) {
        super(marca, velocidadMax, peso, deposito);
        this.setMotor(new Motores("M1", 4000, 250,3.4));
        this.setRueda(new Rueda("Michelin", 30, 99));
        setPeso(peso + this.getMotor().getPeso() + this.getRueda().getPeso());
        setAceleracion(this.getMotor().getFuerza()/this.getPeso());
        setVelocidadMax(velocidadMax);
        setVelocidadMomento(0);
    }

}

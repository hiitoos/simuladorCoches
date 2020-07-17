package com.simuladorCoches;

public class CocheAudi extends Coche {

    public CocheAudi(String marca, double velocidadMax, double peso, int deposito) {
        super(marca, velocidadMax, peso, deposito);
        this.setMotor(new Motores("M2", 4000, 250, 6.7));
        this.setRueda(new Rueda("Goodyear", 30, 98));
        setPeso(peso + this.getMotor().getPeso() + this.getRueda().getPeso() + this.getDepositoActu());
        setAceleracion(this.getMotor().getFuerza()/this.getPeso());
        setVelocidadMax(velocidadMax);
        setVelocidadMomento(0);
    }
}

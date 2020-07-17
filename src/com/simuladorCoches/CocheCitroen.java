package com.simuladorCoches;

public class CocheCitroen extends Coche {

    public CocheCitroen(String marca, double velocidadMax, double peso, int deposito) {
        super(marca, velocidadMax, peso, deposito);
        this.setMotor(new Motores("M4", 4000, 250, 7.9));
        this.setRueda(new Rueda("Goodyear", 30, 98));
        setPeso(peso + this.getMotor().getPeso() + this.getRueda().getPeso());
        setAceleracion(this.getMotor().getFuerza()/this.getPeso());
        setVelocidadMax(velocidadMax);
        setVelocidadMomento(0);
    }
}

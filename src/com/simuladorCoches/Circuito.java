package com.simuladorCoches;

import java.text.DecimalFormat;
import java.util.*;


public class Circuito {
    private double longitud;
    private int cantidadVueltas;
    protected ArrayList<Coche> participantes;
    protected ArrayList<Coche> clasificatoria;
    DecimalFormat df = new DecimalFormat("#.00");

    public Circuito(double longitud, int cantidadVueltas) {
        setLongitud(longitud);
        setCantidadVueltas(cantidadVueltas);
        this.participantes = new ArrayList<>();
        this.clasificatoria = new ArrayList<>();
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getCantidadVueltas() {
        return cantidadVueltas;
    }

    public void setCantidadVueltas(int cantidadVueltas) {
        this.cantidadVueltas = cantidadVueltas;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void addParticipantes(Coche participante) {
        this.participantes.add(participante);
    }

    public void startCarrera() {
        do {
            for (Coche coche : this.getParticipantes()) {
                probabilidadPinchazo(coche);
            }
        } while ((clasificatoria.size() < participantes.size()));
        orden(clasificatoria);
    }

    public void orden(ArrayList<Coche> coches){
            coches.sort(new Comparator<Coche>() {
            @Override
            public int compare(Coche o1, Coche o2) {
                    return o2.compareTo(o1);
            }
        });

        System.out.println("----------- CLASIFICACION FINAL -----------");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println((i + 1) + ". " + coches.get(i).getMarca() + " - Velocidad: " + df.format(coches.get(i).getVelocidadMomento()*3.6) + "km/h - Ruedas: " + coches.get(i).getRueda().getModelo() + " - Motor: " + coches.get(i).getMotor().getModelo());
        }
    }

    public void probabilidadPinchazo(Coche coche) {
        double longi = this.getLongitud() * this.getCantidadVueltas();
        if (coche.getRueda().getFiabilidad() > Math.random()) {
            coche.correr();
        } else {
            coche.setVelocidadMomento(0);
            System.out.println("El coche: " + coche.getMarca() + " ha pinchado.");
        }
        if ((longi <= coche.getRecorrido())) {
            clasificatoria.add(coche);
        }
    }


}

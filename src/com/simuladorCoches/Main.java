package com.simuladorCoches;

public class Main {
    static CocheSeat seat;
    static CocheAudi audi;
    static CocheSkoda skoda;
    static CocheCitroen citroen;
    static Circuito monaco;

    public static void main(String[] args) {
        seat = new CocheSeat("SEAT", 280,1200, 50);
        audi = new CocheAudi("AUDI", 250, 1500, 20);
        skoda = new CocheSkoda("SKODA", 200,1700, 50);
        citroen = new CocheCitroen("CITROEN", 250,1400, 20);

        monaco = new Circuito(4000, 2);

        monaco.addParticipantes(seat);
        monaco.addParticipantes(audi);
        monaco.addParticipantes(skoda);
        monaco.addParticipantes(citroen);

        monaco.startCarrera();
    }

}

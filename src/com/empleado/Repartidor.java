package com.empleado;

public class Repartidor extends Empleado implements Plus{
    private String zona="";
    boolean plus = false;
    public Repartidor(String nombre, int edad, float salario) {
        super(nombre, edad, salario);
    }

    public void setZona(String zona) {
        this.zona = zona;
        plus();
    }

    public void setEdad(int edad) {
        this.edad = edad;
        plus();
    }

    @Override
    public void plus() {
        if (this.getEdad()<25 && this.zona.equals("Zona 3") && !plus){
            salario+=getPLUS();
            plus=true;
        }
        else if (plus){
            salario-=getPLUS();
            plus = false;
        }
    }
}

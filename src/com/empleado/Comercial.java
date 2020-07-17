package com.empleado;

public class Comercial extends Empleado implements Plus{
    double comision;
    boolean plus = false;
    public Comercial(String nombre, int edad, float salario) {
        super(nombre, edad, salario);
    }

    public void setComision(double comision) {
        this.comision = comision;
        if (!plus) this.salario+=this.comision;
        plus();
    }
    public void setEdad(int edad) {
        this.edad = edad;
        plus();
    }

    @Override
    public void plus() {
        if (this.getEdad()>30 && comision>200){
            this.salario+=getPLUS()+this.comision;
            plus=true;
        }
        else if (plus){
            salario-=getPLUS();
            plus = false;
        }
    }
}

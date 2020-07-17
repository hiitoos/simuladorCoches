package com.empleado;

abstract class Empleado{
    private String nombre;
    static int edad;
    float salario;
    private final int PLUS=300;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " Salario: " + this.salario;
    }
}

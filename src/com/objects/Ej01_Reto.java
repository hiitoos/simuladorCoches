package com.objects;
//Principio de composición
class Clase{
    String nombre;
    Alumno[] alumnos;
    private int aforo;

    public Clase(String nombre, int aforo){
        this.nombre = nombre;
        this.alumnos = new Alumno[aforo];
        this.aforo = aforo;
        this.crearAlumnosRandom();
    }

    private void crearAlumnosRandom(){
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(
                    "Student " + i,
                    (int) Math.round(Math.random() * 10),
                    (int) (Math.random() * 60) + 20
            );
        }
    }

    public void mostrarAlumnos(){
        //For enhanced
        for (Alumno item : alumnos) {
            item.mostrarTodo();
        }
    }

    public int getAforo(){
        return this.aforo;
    }

    public void setAforo (int aforo){
        this.aforo = aforo;
    }
}

class Alumno {
    String nombre;
    double nota;
    int edad;

    //Constructor
    public Alumno(String nombre, int nota, int edad) {
        this.nombre = nombre;
        this.nota = nota;
        this.edad = edad;
    }

    public void mostrarTodo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nota: " + this.nota);
        System.out.println("Edad: " + this.edad);
        System.out.println("------------------------");
    }
}


public class Ej01_Reto {

    public static void main(String[] args) {
        Clase primeroA = new Clase("1A", 10);
        primeroA.mostrarAlumnos();
        System.out.println(primeroA.getAforo());
        primeroA.setAforo(59);
        System.out.println(primeroA.getAforo());
    }
}

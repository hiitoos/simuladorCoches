package com.photograph;

import java.util.ArrayList;

class TarjetaSD {
    int memoriaTotal;
    int memoriaLibre;
    ArrayList<Archivo> archivos;

    public TarjetaSD(int memTot, int memLib) {
        this.memoriaTotal = memTot;
        this.memoriaLibre = memLib;
        this.archivos = new ArrayList<>();
    }

    public void addArchivo(Archivo archivo){
        archivos.add(archivo);
        memoriaLibre-=archivo.peso;

    }

    public void borrarArchivo(int position) {
        archivos.remove(position);
        memoriaLibre++;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public int getMemoriaTotal() {
        return memoriaTotal;
    }

    public int getMemoriaLibre() {
        return memoriaLibre;
    }
}
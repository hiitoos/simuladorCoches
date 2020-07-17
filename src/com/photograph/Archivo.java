package com.photograph;


public class Archivo {
    String nombre;
    private String ext;
    int peso;
    protected String[] extPermitidas;

    protected Archivo(String nombre, String ext, int peso, String[] extPermitidas) {
        this.extPermitidas = extPermitidas;
        this.setExt(ext);
        this.nombre = nombre;
        this.peso = peso;
    }

    public void setExt(String ext) {
        if (comprobarExtension(ext)) {
            this.ext = ext;
        }else{
            this.ext = "";
        }
    }

    public String getExt() {
        return ext;
    }

    boolean comprobarExtension(String ext){
        for( String s : extPermitidas){
            if (s.equals(ext)){
                return true;
            }
        }
        return false;
    }
}

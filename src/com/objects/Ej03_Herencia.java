package com.objects;

class Archivo {
    String nombre;
    private String ext;
    int peso;
    String[] extPermitidas = {"jpg","png","svg","mp4","mkv","avi"};

    public Archivo(String nombre, String ext, int peso) {
        this.nombre = nombre;
        this.setExt(ext);
        this.peso = peso;
    }

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

class Fotografia extends Archivo {
    String[] extPermitidas = new String[]{"jpg","png","svg"};

    public Fotografia(String nombre, String ext, int peso) {
        super(nombre, ext, peso, new String[]{"jpg","png","svg"});
    }

}

class Video extends Archivo {
    String[] extPermitidas = {"mp4","mkv","avi"};

    public Video(String nombre, String ext, int peso) {
        super(nombre, ext, peso, new String[]{"mp4","mkv","avi"});
    }
}


public class Ej03_Herencia {
    public static void main(String[] args) {
        Archivo archivo = new Archivo("archivo", "mpk", 20);
        System.out.println(archivo.getExt());

        Fotografia foto = new Fotografia ("Foto 1", "jpg", 20);
        System.out.println(foto.getExt());
    }
}
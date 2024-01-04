package com.company;

public class Masajista extends SeleccionFutbol {
    public String titulacion;
    public int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){
        super();
    }
    public Masajista(int aniosExperiencia,String titulacion,int id,String nombre,String apellidos,int edad){
        super(id,nombre,apellidos,edad);
        this.aniosExperiencia=aniosExperiencia;
        this.titulacion=titulacion;
    }

    public int getAniosExperiencia(){
        return aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void darMasaje(){
        System.out.println("dare masaje a los futbolistas");
    }
}

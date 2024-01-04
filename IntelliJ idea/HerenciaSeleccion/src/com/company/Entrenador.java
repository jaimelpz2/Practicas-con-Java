package com.company;

public class Entrenador extends SeleccionFutbol {

    public String idfederacion;

    public Entrenador(){ //declaracion de la herencia del padre
        super();
    }

    public Entrenador(int id,String nombre, String apellidos,int edad,String idfederacion){
        super(id,nombre,apellidos,edad);
        this.idfederacion=idfederacion;
    }

    public String getIdfederacion() {
        return idfederacion;
    }

    public void setIdfederacion(String idfederacion) {
        this.idfederacion = idfederacion;
    }

    public void dirigirPartido(){
        System.out.println("Estamos dirigiendo el partido");
    }

    public void dirigirEntrenamiento(){
        System.out.println("Estamos dirigiendo el entrenamiento");
    }

}

package com.company;

public class SeleccionFutbol {
   public int id,edad;
   public String nombre,apellidos;

   public SeleccionFutbol(){

   }
   public SeleccionFutbol(int id,String nombre,String apellidos,int edad){
       this.id=id;
       this.nombre=nombre;
       this.apellidos=apellidos;
       this.edad=edad;
   }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }


    public void concentrarse(){
       System.out.println("Estoy concentrandome");

   }


}

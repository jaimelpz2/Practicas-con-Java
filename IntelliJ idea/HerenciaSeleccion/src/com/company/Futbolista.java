package com.company;

public class Futbolista extends SeleccionFutbol {
    public int dorsal;
    public String demarcacion;

    public Futbolista(){
        super();
    }
    public Futbolista (int id,String nombre,String apellidos,int edad,int dorsal,String demarcacion) {
        super(id,nombre,apellidos,edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void juparPartido() {
        System.out.println("estamos jugando en el partido espera");
    }

    }
package com.company;

import java.util.Scanner;

public class Temperature {
    public int celsius;
    public int kelvin;
    Scanner almacen = new Scanner(System.in);

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getKelvin() {
        return kelvin;
    }

    public void setKelvin(int kelvin) throws IllegalTemperatureException {
        this.kelvin = kelvin;
        if (kelvin < 0) {
            throw new IllegalTemperatureException();
        }
    }

        public void Temperaturas (int kelvin,int celsius){
            System.out.println("la temperatura celsius fue de: "+getCelsius());
            this.getCelsius();
            System.out.println("la temperatura kelvin fue de: "+getKelvin());
            this.getKelvin();
        }


}



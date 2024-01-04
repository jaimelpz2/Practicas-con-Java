package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalTemperatureException {
        int celsius;
        int kelvin;
        boolean Band=true;
        Scanner almacen = new Scanner(System.in);
        Temperature t = new Temperature();

        System.out.println("\033[033m");
            System.out.println("Introduzca la temperatura en celsius");
            celsius = almacen.nextInt();
            t.setCelsius(celsius);
        System.out.println("introduzca la temperatura en kelvin:");
        kelvin=almacen.nextInt();
            do{
try{

    t.setKelvin(kelvin);
        Band=true;
}catch( IllegalTemperatureException ex){
    System.out.println("Error... los grados kelvin no aceptan negativo");
    kelvin=almacen.nextInt();
    Band=false;
}

        }while(Band==false);
            t.Temperaturas(kelvin,celsius);

        }

        }





package com.company;

public class IllegalTemperatureException extends Exception {

    public IllegalTemperatureException(){
        super("Error.. En la temperatura kelvin.. Kelvin no acepta temperaturas negativas como ella no te acepto ahi...");

    }
}

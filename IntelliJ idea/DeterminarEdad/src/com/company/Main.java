//pediremos la edad si es mayor o nose y se repita hasta que obtenga un valor int
package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int edad;
        Scanner almacen= new Scanner(System.in);
       boolean Auyowoki=false;

do {
    try {
        Auyowoki=true;
        System.out.println("\033[32m");
        System.out.println("Registre su edad para definir si es mayor o no");
        edad = almacen.nextInt();
        System.out.println("\033[031m");

        if (edad > 17) {
            System.out.println("senior ya esta mas del otro lado que de aca ya preparese *El DON de la tienda*");
        } else {
            System.out.println("huy no mijito estas bien joven come sano y fuerte para que crezcas mucho y vivas mucho *tu ABUELA*");
        }


    } catch (InputMismatchException e) {
        Auyowoki=false;
        System.out.println("\033[034m");
        System.out.println("Recuerde que para introducir su edad deben de ser numeros");
        almacen.next();

    }
}while(Auyowoki==false);
 }

    }








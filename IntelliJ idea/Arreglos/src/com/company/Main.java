package com.company;

import java.util.Scanner;

public class Main {
   // public static Arreglos arreglos; // una forma de usar los metodos del a otra clase o

    public static void main(String[] args) {
       // arreglos.columnas;         //siendo static
        Arreglos arreglos=new  Arreglos(); // se puede realizarla  instancia como otra forma
        int opc=0,col,renglones;
        int v[];
        int m[][];
        int suma=0;
        Scanner almacen=new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("M E N U");
            System.out.println("Elija la opcion que usted requiera");
            System.out.println("1:LEER Vector");
            System.out.println("2:LEER Matriz");
            System.out.println("3:Sumar vector");
            System.out.println("4:sumar matriz");
            System.out.println("5:sumar renglones de la matriz");
            System.out.println("6:sumar columnas de la matriz ");
            System.out.println("7: SALIR");
            System.out.println("");
            System.out.println("");
            opc=almacen.nextInt();

            switch(opc){

                case 1: //leer vector
                    System.out.print("Ingrese el Numero de columnas:");
                    col=almacen.nextInt();
                    v=arreglos.leer(col);
                    arreglos.imprimirArreglo(v);
                    System.out.println("");
                    break;
                case 2://leer matriz
                    System.out.println("ingrese el numero de columnas y renglones para una matriz");
                    System.out.print("ingrese las columnas");
                    col=almacen.nextInt();
                    System.out.print("ingrese los renglones");
                    renglones=almacen.nextInt();
                    m=arreglos.leer(renglones,col);
                    arreglos.imprimirArreglo(m);
                    break;
                case 3://sumar vector
                    System.out.print("Ingrese el Numero de columnas:");
                    col=almacen.nextInt();
                    v=arreglos.leer(col);
                    arreglos.imprimirArreglo(v);
                    System.out.println("");
                    System.out.println("Sumando vector");
                    arreglos.sumarArreglo(v);
                    break;
                case 4://sumar matriz
                    System.out.print("introduzca el numero de columnas");
                    col=almacen.nextInt();
                    System.out.print("introduzca el numero de renglones");
                    renglones=almacen.nextInt();
                    m=arreglos.leer(col,renglones);
                    arreglos.imprimirArreglo(m);
                    System.out.println("la suma total de la matriz es:"+arreglos.sumarArreglo(m));
                    break;
                case 5:// sumar renglones de la matriz
                    System.out.print("introduzca el numero de columnas");
                    col=almacen.nextInt();
                    System.out.print("introduzca el numero de renglones");
                    renglones=almacen.nextInt();
                    m=arreglos.leer(renglones,col);
                    arreglos.imprimirArreglo(m);
                    System.out.println("la suma de los renglones de la matriz es:"+arreglos.sumarArreglo(m,renglones));
                    break;
                case 6: // sumar columnas de la matriz
                    System.out.print("introduzca el numero de columnas");
                    col=almacen.nextInt();
                    System.out.print("introduzca el numero de renglones");
                    renglones=almacen.nextInt();
                    m=arreglos.leer(col,renglones);
                    arreglos.imprimirArreglo(m);
                    System.out.println("la suma de las columnas de la matriz es:"+arreglos.sumarArreglo(col,m));
                    break;


            }
        }while(opc<=6);

    }
}

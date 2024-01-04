package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        Calculos calculos = new Calculos();
        int num1, num2, opc = 0, sum1=1,sum2=1;
        Scanner almacen = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println();
            System.out.println("M E N U");
            System.out.println("1.calcularPar");
            System.out.println("2.calcularPrimo");
            System.out.println("3.calcularPerfecto");
            System.out.println("4.calcularAmigo");
            System.out.println("5.calcularFactorial");
            System.out.println("6.mostrarFibonacci");
            System.out.println("7.Creditos");
            System.out.println(">8.salir");
            System.out.println();
            opc = almacen.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("introduce el numero para saber si es par");
                    if (calculos.calcularPar()) {

                        System.out.println("el numero es par");
                    } else {
                        System.out.println("el numero es impar ");
                    }
                    break;

                case 2:
                    System.out.println("introduce el numero para saber si es primo");
                    System.out.println("el numero primo es :"+calculos.calcularPrimo());

            break;

            case 3:
                System.out.println("introduzca un numero para determinar si es perfecto:");
                System.out.println("El numero es: "+calculos.calcularPerfecto());
                break;

            case 4:
                System.out.println("introduzca dos numeros para determinar si es amigo");
                System.out.println("el primero :");
                System.out.println("el segundo:");
                if(calculos.calcularAmigos()){
                    System.out.println("son amigos");
                }
                else{
                    System.out.println("no son amigos");
                }
                break;

            case 5:
                System.out.println("introduzca el numero para evaluar su factorial");
                System.out.println("El numero factorial es: " + calculos.calcularFactorial());
                break;

            case 6:
                System.out.println("cuantos numeros de la serie fibonacci quiere imprimir?: ");
                calculos.mostrarseriefibonacci();
                break;
            case 7:
                System.out.println("C R E D I T O S");
                System.out.println("Programa realizado por el estudiante: Comparan Velasco Jaime Armando");
                System.out.println("Realizado en la universidad: TECNOLOGICO SUPERIOR MARIO MOLINA");
                System.out.println("Materia en la que se llevo a cabo: Programacion Orientada a Objetos");
                System.out.println("Maestro Rigoberto larios ");
                System.out.println("Periodo Escolar: febrero-julio");
                System.out.println("patricionado por: intel,amd,Nvidia,Asus,lotigtech,corsair,kingston");
                System.out.println("en honor a todos los programador del codigo java");
                break;


        }//switch


    }while(opc<8);


   }// funtion main
}
// class main

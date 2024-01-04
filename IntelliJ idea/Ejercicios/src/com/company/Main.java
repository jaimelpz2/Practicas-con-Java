//realizar 24 programas con funciones para distinas resoluciones
package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int opc,num,Base,altura,num1,num2;
        char letras;
        String cadena="the beatles were the best band of the world";
        String cadenainvertida,entrada,salida;
        Scanner almacen = new Scanner(System.in);
        Funciones funciones = new Funciones();

        do{
            System.out.println();
            System.out.println();
            System.out.println("                M  E  N  U ");
            System.out.println("1.Calcular el Area de un triangulo");
            System.out.println("2.Calcular el Area de un triangulo con diferente funcion");
            System.out.println("3.Calcular un numero si es par o no");
            System.out.println("4.Calcular un numero si es par o no con diferente funcion");
            System.out.println("5.Calcular si un numero es primo o no");
            System.out.println("6.Calcular si un numero es primo o no con diferente funcion");
            System.out.println("7.Convertir una letra a mayuscula");
            System.out.println("8.Determinar si es un digito o no");
            System.out.println("9.Devolucion de un numero entero por su numero absoluto");
            System.out.println("10.Determinar las vocales que hay en una palabra");
            System.out.println("11.Conversion de una palabra a una letra ");
            System.out.println("12.Intercambiar valores entre cadenas");
            System.out.println("13.Calcular el numero factorial de un numero");
            System.out.println("14.Calcular el numero factorial de un numero con diferente funcion");
            System.out.println("15.Calcular el maximoComunDivisor de un numero mediante euclides");
            System.out.println("16.Calcular la longitud de una frase");
            System.out.println("17.Leer una frase y escribirla al reves");
            System.out.println("18.Leer frase y devolver la cantidad de veces de rotarla");
            System.out.println("19.leer frase y determinar si es un palindromo");
            System.out.println("20.Conversion a mayusculas una frase o palabra");
            System.out.println("");
            System.out.println("21.C R E D I T O S");
            System.out.println("");
            System.out.println("elija la opcion que usted requiera:");
            opc=almacen.nextInt();

            switch(opc){

                case 1:
                    System.out.println("");
                    System.out.println("calcularemos el area de un triangulo la formula es:");
                    System.out.println("              Base*Altura/2              ");
                    System.out.println("");
                    System.out.println("introduce la Base del triangulo");
                    Base=almacen.nextInt();
                    System.out.println("introduce la altura del triangulo");
                    altura=almacen.nextInt();
                    System.out.println("El Area del triangulo es: "+funciones.calcularArea(Base,altura));
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("calcularemos el area de un triangulo la formula es:");
                    System.out.println("                   Base*altura/2          ");
                    System.out.println("");
                    System.out.println("introduzca la base del triangulo");
                    Base=almacen.nextInt();
                    System.out.println("introduzca la altura del triangulo");
                    altura=almacen.nextInt();
                    funciones.calcularArea2(Base,altura);
                    break;

                case 3:
                    System.out.println("introduce un numero para determinar si es par o no:");
                    num=almacen.nextInt();
                    System.out.println("El numero es par si sale 1 e impar si sale 0: "+funciones.devolverPar(num));
                    break;

                case 4:
                    System.out.println("introduzca un numero para deterinar si es par o no");
                    num=almacen.nextInt();
                    funciones.devolverPar2(num);
                    break;

                case 5:
                    System.out.println("introduzca un numero para determinar si es primo o  no");
                    num=almacen.nextInt();
                    System.out.println("El numero:"+num+" el primo es:"+funciones.devolverPrimo(num));
                    break;

                case 6:
                    System.out.println("introduzca un numero para determinar si es primo o no ");
                    num=almacen.nextInt();
                    System.out.println("El numero: "+num+ " es: "+funciones.devolverPrimo2(num));
                    break;

                    case 7:
                        System.out.println("convertir una letra minuscula a mayuscula");
                        System.out.println("Introduzca una letra ");
                        letras=almacen.next().charAt(0);
                        System.out.println("La palabra convertida es:"+funciones.conversionDeLetras(letras));
                        break;

                case 8:
                    System.out.println("Introduce una letra para Determinar si es un digito o no");
                    letras=almacen.next().charAt(0);
                    System.out.println("EL digito es: si es 1 lo es, si es 0 no es un digito:: "+funciones.determinarDigitos(letras));
                    //System.out.println("el digito es:"+funciones.determinarDigitos(letras));
                    break;

                case 9:
                    System.out.println("Determinar el valor absoluto de un numero");
                    System.out.println("Ingrese un numero real ");
                    num=almacen.nextInt();
                    System.out.println("El valor absoluto de: "+num+" es:"+funciones.numeroAbsoluto(num));
                    break;

                case 10:
                    System.out.println("Determinar las vocales que hay en una frase o palabra");
                    funciones.vocalesFrase(cadena);
                    break;

                case 11:
                    System.out.println("Devolver  el intercambio de valores de las cadenas");
                    System.out.println("introduzca letras de la cadena  ");
                    entrada=almacen.next();
                    System.out.println("introduzca las  letras de un char");
                    letras=almacen.next().charAt(0);
                   funciones.devolverCadenaYChar(entrada,letras);
                    break;


                case 12:
                    System.out.println("Descrubiremos como se intercambian los valores entre las cadenas");
                    System.out.println("introduzca las letras de su primera cadena");
                    entrada=almacen.next();
                    System.out.println("introduzca las letras de su segunda cadena");
                    salida=almacen.next();
                    funciones.intercamValores(entrada,salida);
                    break;


                    case 13:
                        System.out.println("Determinar el numero factorial");
                        num=almacen.nextInt();
                        System.out.println("El numero factorial de: " +num+ " es:" +funciones.calcularFactorial(num));
                    break;


                case 14:
                    System.out.println("Determinar el numero factorial");
                    num=almacen.nextInt();
                    funciones.calcularFactorial2(num);
                    break;

                    case 15:
                        System.out.println("Determinar cual es el maximocomundivisor");
                        System.out.println("ingrese el primer numero a comparar");
                        num1=almacen.nextInt();
                        System.out.println("ingrese el segundo numero a comparar");
                        num2=almacen.nextInt();
                        System.out.println("El maximo Comun divisor de: "+num1+ " y"+num2+ " es:"+funciones.euclides(num1,num2));
                    break;

                case 16:
                    System.out.println("Imprimir la cadena al reves y descubrir la longitud");
                    funciones.leerLongitudFrase(cadena);
                    break;

                case 17:
                    System.out.println("Imprimira las palabras al reves ");
                    funciones.leeAlreves(cadena);
                    break;

                case 18:
                    System.out.println("Determinara las rotaciones de las cadenas");
                    funciones.leerFraseYRotar();
                    break;

                case 19:
                    System.out.println("Determinara si una cadena es palindromo");
                    System.out.println("Ingrese palabra");
                    entrada=almacen.next();
                    funciones.Palindromo(cadena);
                    break;

                case 20:
                    System.out.println("Convertiremos una palabra o frase a mayusculas");
                    System.out.println("La palabra es: "+cadena);
                    System.out.println("La palabra convertida a mayusculas es: "+funciones.fraseAMayusculas(cadena));
                    break;


                case 21:
                    System.out.println("Realizado por: Comparan Velasco Jaime Armando");
                    System.out.println("Realizado en la universidad: Tecnologico Superior de Zapopan");
                    System.out.println("Realizado durante la asigacion de: Programacion Orientada a Objetos");
                    System.out.println("Con la direccion del maestro: Rigoberto larios");
                    System.out.println("Durante el periodo escolar febrero-julio 2019");
                    System.out.println("Un Orgullo jaliciense");
                    System.out.println("Fin");
                    break;

            }//switch

        }while(opc<20);

    }//main
}//class

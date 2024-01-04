package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Funciones {

    Scanner almacen = new Scanner(System.in);
    public int num, num2, Base, altura, area, vocales, fact = 1;
    public int valorabsoluto, contador = 0, limite, inicio = 0;
    public char letras;
    public String cadena = "the beatles were the best band of the world";
    public String cadenainvertida, entrada, salida;


    public int calcularArea(int Base, int altura) { //1
        area = Base * altura / 2;
        return area;
    }

    public void calcularArea2(int Base, int altura) {//2
        area = Base * altura / 2;
        System.out.println("El area del triangulo es:" + area);
    }

    public void devolverPar2(int num) {//3
        int par = 1, impar = 0;
        if (num % 2 == 0) {
            System.out.println("El numero es Par: " + par);
        } else {
            System.out.println("el numero es impar: " + impar);
        }

    }

    public int devolverPar(int num) {//4
        if (num % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean devolverPrimo(int num) {//5
      for(int i=2;i<num;i++){
          if(num%i==0){
              return false;
          }

      }
    return true;}

    public int devolverPrimo2(int num) {//6
        int primo=1; int inprimo=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                return inprimo;
            }

        }
    return primo;}

    public char conversionDeLetras(char letras) {//7
        if (Character.isUpperCase((letras))) {
            letras = Character.toLowerCase((letras));
            System.out.println((letras));
        } else {
            letras = Character.toUpperCase((letras));
            System.out.println(letras);
        }

        return letras;
    }

    public int determinarDigitos(char letras) {//8
        if (Character.isDigit(letras)) {
            return 1;
        } else

            return 0;
    }

    public int numeroAbsoluto(int num) {//9
        valorabsoluto = Math.abs(num);
        return valorabsoluto;
    }

    public void vocalesFrase(String cadena) {//10
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u')
                ;
            contador++;
        }
        System.out.println("La cantidad de vocales en la palabra: " + cadena + "   son:" + contador);
    }

    public String devolverCadenaYChar(String entrada, char letras) { //11
        entrada.toCharArray();
        return entrada;
    }

    public void intercamValores(String entrada,String salida){//12
        System.out.println("Las letras o caracteres iniciales de las cadenas son: "+entrada+ " y "+salida+"");
        String AUX;
        AUX=entrada;
        entrada=salida;
        salida=AUX;

        if(entrada.length()==salida.length()){
            System.out.println("los valores intercambiados entre cadenas son:"+"Cadena1: "+entrada+" cadena2:"+salida);
        }
        else{
            System.out.println("Ingresar del mismo tama;o las 2 cadenas ");
        }

    }


    public int calcularFactorial(int num) {//13
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public void calcularFactorial2(int num) {//14
        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        System.out.println("el numero factorial de: " + num + " es:" + fact);
    }

    public int euclides(int num1, int num2) {//15
        if (num2 == 0) {
            return num1;
        } else
            return euclides(num2, num1 % num2);
    }

    public void leerLongitudFrase(String cadena) {//16
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenainvertida += cadena.charAt(i);
        }
        System.out.println("La Cadena es: " + cadena + " y la cadena invertida  es: " + cadenainvertida + " y su longitud es de: " + cadenainvertida.length());

    }//16


    public void leeAlreves(String cadena) {//17
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenainvertida += cadena.charAt(i);
        }
        System.out.println("La cadena es: " + cadena + "  invertida es:" + cadenainvertida);
    }

    public void leerFraseYRotar() throws IOException {//18

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese la frase a rotar:");
        entrada = br.readLine();
        System.out.println("numero de veces a rotar:");
        limite = almacen.nextInt();
        for (int j = 0; j < limite; j++) {
            for (int i = 0; i < entrada.length() - 1; i++) {
                entrada = entrada.charAt(entrada.length() - 1) + entrada.substring(0, entrada.length() - 1);
                System.out.println(entrada);
            }
        }
    }

    public void Palindromo(String entrada) {//19
        boolean espalindromo =false;
        int termino = entrada.length()-1 ;
        while (inicio <= termino) {
            if (entrada.charAt(inicio) == entrada.charAt(termino)) {
                espalindromo=true;
            }
            inicio++;
            termino--;
        }
        if (espalindromo) {
            System.out.println("es palindromo");
        } else {
            System.out.println("no es palindromo");
        }
    }//20

    public String fraseAMayusculas(String cadena) {//20
        return cadena.toUpperCase();}
    }





//class Funciones



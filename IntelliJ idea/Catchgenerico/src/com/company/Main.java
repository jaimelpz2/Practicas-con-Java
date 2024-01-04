package com.company;


public class Main {

    public static void main(String[] args) {

        int num[] = {4, 8, 16, 32, 64, 128, 256};
        int den[] = {2, 0, 4, 4, 0, 8};


        for (int i = 0; i < num.length + 1; i++) {
            try {
                System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
            } catch (ArrayIndexOutOfBoundsException Excep) {
                System.out.println("\033[032m");
                System.out.println("Esta intentando acceder a un sitio fuera de limite siendo el espacio: " + i);


            } catch (Throwable Excep) {
                System.out.println("\033[036m");
                System.out.println("Ocurrio un error  y fue solucionado de manera automatica y generica");//excepcion generica tratando la aritmetica num/0
            }
        }

    }
}

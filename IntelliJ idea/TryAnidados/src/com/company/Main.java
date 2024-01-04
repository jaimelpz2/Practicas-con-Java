package com.company;

public class Main {

    public static void main(String[] args) {

        int num[] = {4, 8, 16, 32, 64, 128, 256};
        int den[] = {2, 0, 4, 4, 0, 8};
        try{
            for(int i=0;i<num.length;i++){
                try{
                    System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
                }
                catch (ArithmeticException Excep){
                    System.out.println("\033[032m");
                    System.out.println("Error...usted esta intentado dividir un numero entre 0, siendo el numero: "+num[i]);
                }

            }
        }catch (Throwable Excep){
            System.out.println("\033[031m");
            System.out.println("Ocurrio un error y fue solucionado de manera automatica y generica");//excepcion generica tartando el error de ArrayIndex
        }
        System.out.println("\033[035m");
        System.out.println("Continuacion del programa.....");


    }
}

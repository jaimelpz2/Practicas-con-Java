package com.company;

class ExcepcionesMultiples{
     static void divide() {
        int num[] = {4, 8, 16, 32, 64, 128, 256};
        int den[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length + 1; i++) {
            try{
                System.out.println(num[i]+"/"+den[i]+"="+num[i]/den[i]);
            }
            catch (java.lang.ArithmeticException exception){
                System.out.println("\033[034m");
                System.out.println("usted esta diviendo por cero lo cual es imposible siendo el numero: "+num[i]);
            }
            catch(java.lang.ArrayIndexOutOfBoundsException exception){
                System.out.println("\033[032m");
                System.out.println("Error Accesar al vector ya que sobrepasa el limite del vector siendo el espacio: "+i);
            }
        }
    }
}


public class Main {

    public static void main(String[] args) {

        ExcepcionesMultiples.divide();

    }
}

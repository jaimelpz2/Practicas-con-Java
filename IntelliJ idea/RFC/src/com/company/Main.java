package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalRFCException, IllegalRFCException2,  IllegalRFCException3,IllegalRFCException4 {
        String RFC;
        RFC=new String();
        Scanner almacen = new Scanner(System.in);
        System.out.println("\033[036m");
        System.out.println("Registre su RFC caracter por caracter");

        for (int i = 0; i <= 12; i++) {

            if (i <= 3) {
                RFC = almacen.nextLine();
                for (char c : RFC.toCharArray()) {
                    if (!Character.isLetter(c)) {
                        throw new IllegalRFCException();


                    }
                }

            }
            if (i >= 4 && i <= 9) {
                RFC = almacen.next();
                for (char c : RFC.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        throw new IllegalRFCException2();


                    }
                }

            }

            if (i>12) {
                RFC=almacen.next();
                throw new  IllegalRFCException3();

            }

            if(i>=10){
                RFC=almacen.next();
                for(char c: RFC.toCharArray()){
                    if(!Character.isLetterOrDigit(c)){
                        throw new IllegalRFCException4();
                    }
                }
            }


                }//For


                }//main

    private static class IllegalRFCException extends Exception {
        public IllegalRFCException() {
            super("Error... RFC primeras iniciales con letras..");
        }
    }

    private static class IllegalRFCException2 extends Exception {
        public IllegalRFCException2() {
            super("Error.... RFC Continuacion de las iniciales con su fecha de nacimiento.. (numeros..)");
        }


    }

    private static class IllegalRFCException3 extends Exception {
        public IllegalRFCException3() {
            super("Error.... EXceso de elementos en el RFC...Rescriba..");
        }
    }
    private static class IllegalRFCException4 extends Exception {
        public IllegalRFCException4() {
            super("Error.... Solo un numero y 2 letras para su HomoClave");
        }
    }

            }












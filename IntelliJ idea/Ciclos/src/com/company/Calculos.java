package com.company;

import java.util.Scanner;

public class Calculos {

    public int num1, num2;
    Scanner almacen = new Scanner(System.in);

    public boolean calcularPar() {
        num1 = almacen.nextInt();
        if (num1 % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean calcularPrimo() {
        num1 = almacen.nextInt();
        int primo;
        for (int i = 2; i < num1; i++) {
            primo = num1 % i;
            if (primo == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean calcularPerfecto() {
        num1 = almacen.nextInt();
        int suma = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % 1 == 0) {
                System.out.println("los divisores del numero perfecto son:" + i);
                suma = suma + i;
            }
            if (suma == num1) {
                return true;
            }
        }

        return false;
    }

    public boolean calcularAmigos() {
        num1 = almacen.nextInt();
        num2 = almacen.nextInt();
        int suma = 0;
        for (int i = 1; i < num1 / 2 + 1; i++) {
            if (num1 % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == num2) {
            suma = 0;
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) ;
                suma = suma + i;
            }
            return true;
        }
        return false;
    }

    public double calcularFactorial() {
        double fact = 1;
        num1 = almacen.nextInt();
        for (int i = 1; i <= num1; i++) {
            fact *= i;
        }
        return fact;
    }

    public void mostrarseriefibonacci() {
        int k = 0, j = 1;
        num1 = almacen.nextInt();
        for (int i = 0; i < num1; i++) {
            int t;
            t = k + j;
            k = j;
            j = t;
            System.out.println("La serie fibonacci es:" + j);

        }

    }


}
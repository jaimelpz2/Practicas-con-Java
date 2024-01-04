package com.company;

import java.util.Scanner;

public class Arreglos {

    //Atributos de la Clase
    public int renglones;
    public int columnas;
    public int[] vector;
    public int[][] matriz;
    public int sumasRenglones,sumasCol;

    public Scanner almacen = new Scanner(System.in);

    //Metodos de la Clase
    public int[] leer(int x) {
        vector = new int[x];
        for (columnas = 0; columnas < x; columnas++) {
            System.out.print("Elemento[" + columnas + "]:");
            vector[columnas] = almacen.nextInt();

        }
        System.out.println("");

        return vector; }


    public int[][] leer(int x, int y) {
        matriz = new int[x][y];
        for (columnas = 0; columnas < matriz.length; columnas++) {
            for (renglones = 0; renglones < matriz[columnas].length; renglones++) {

                System.out.print("numero[" + columnas +"]["+ renglones + "]:");
                matriz[columnas][renglones] = almacen.nextInt();
            }
            System.out.println("");
        }

        return matriz;  }
    public void imprimirArreglo(int vector[]) {
        for (columnas = 0; columnas < vector.length; columnas++) {
            System.out.print(vector[columnas] + "");
        }
        System.out.println("");
    }

    public void imprimirArreglo(int matriz[][]) {
        for (columnas = 0; columnas < matriz.length; columnas++) {
            for (renglones = 0; renglones < matriz[columnas].length;renglones++)
                System.out.print("["+matriz[columnas][renglones] +"]");
            System.out.println("");
        }

     }

        public int sumarArreglo(int x[]){
            sumasCol=0;
            for(int i=0;i<x.length;i++){
                sumasCol+=x[i];
                System.out.println("la suma de la columna ["+i+"]"+sumasCol);
            }
            System.out.print("");

       return sumasCol; }


       public int sumarArreglo(int a[][]){
           sumasCol=0;
           for(int  i=0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   sumasCol+=a[i][j];
               }
               System.out.println("la suma  de la matriz es:["+i+"]"+sumasCol);
           }
           System.out.println("");

       return sumasCol;}


    public int sumarArreglo (int a[][],int y){
        sumasRenglones=0;
        for(columnas=0;columnas<a.length;columnas++){
            for(renglones=0;renglones<a[columnas].length;renglones++){
                sumasRenglones+=a[columnas][renglones];
            }
            System.out.println("la suma de los renglones  de la matriz son:["+renglones+"]"+sumasRenglones);
        }
        System.out.print("");

        return sumasRenglones;}

    public int sumarArreglo (int x,int a[][]){
        sumasCol=0;
        for(int j=0;j<columnas;j++){
            for(int i=0;i<renglones;i++){
                sumasCol+=matriz[i][j];
            }
            System.out.println("la suma de las columnas son:"+sumasCol);
        }
        System.out.print("");

    return sumasCol;}


}




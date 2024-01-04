package com.company;
import java.io.File;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num;
        Scanner almacen =new Scanner(System.in);
        File f=new File("d:\\numerosprimos.txt");
        try{
            FileWriter fw=new FileWriter(f);
            PrintWriter pw =new PrintWriter(fw);
            System.out.println("introduzca un numero para determinar sus primos");
            num=almacen.nextInt();

            for(int i=1;i<=num;i++){
                int divisor=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0)
                        divisor++;
                }
                if(divisor==2) {
                    pw.println(i);
                    System.out.println(i);
                }
            }
            fw.close();
        }catch(Throwable e){
            System.out.println("Error.. no se ha podido acceder a los archivos por alguna razon");
        }

    }
}

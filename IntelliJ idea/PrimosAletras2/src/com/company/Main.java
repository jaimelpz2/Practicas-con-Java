package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char letras = 'a';
        Scanner almacen = new Scanner(System.in);
        File in = new File("d:\\numerosprimos.txt");
        File out = new File("d:\\primosletras.txt");
        FileReader fr;
        FileWriter fw;
        BufferedReader br;
        PrintWriter pw;


        try {
            fr = new FileReader(in);
            fw = new FileWriter(out);
            br = new BufferedReader(fr);
            pw = new PrintWriter(fw);

            String linea = br.readLine();
            while (linea != null) {
                int num = Integer.parseInt(linea);
                int pri=primos(num);
                for(int i=1;i<=primos(num);i++){
                    pw.println(letras);
                    System.out.println(letras);
                }letras++;

                linea=br.readLine();


            }
            fr.close();
            fw.close();


        } catch (Throwable e) {
            System.out.println("Error archivos no encontrados error..");
        }
    }


    private static int primos (int num){
         int primo=1;
        for(int i=1;i<=num;i++){
            int divisor=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    divisor++;
                primo=0;

            }
            if(divisor==2) {
               primo=i;
            }

        }

        return primo;}

}




package com.company;

import java.io.*;

public class Main {
    //public  static int fact=1;

    public static void main(String[] args) {

	File in= new File("d:\\archivosnumeros.txt");
	File out= new File("d:\\archivosnumeros2.txt");
	FileReader fr;//flujo de lectura
        FileWriter fw;//flujo de escritura

        BufferedReader br;//lector
        PrintWriter pw;//escritor
        try{
            fr=new FileReader(in);
            fw=new FileWriter(out);
            br=new BufferedReader(fr);
            pw=new PrintWriter(fw);

            String linea=br.readLine();//lee la primera linea de entrada
            while(linea!=null){
                int num=Integer.parseInt(linea);//convierte de string a int
                int fac=factorial(num);// calcular el factorial
                pw.println(fac);//escribe en el archivo de salida
                linea=br.readLine();//lee una linea de la entrada
                System.out.println(fac);
            }
            fr.close();
            fw.close();

        }catch(Throwable e){
            System.out.println("Error... why? i Dont Know");

        }
    }
    private static int factorial(int num){
        int fact =1;
        for (int i = 1; i <= num; i++) {
            fact =fact*i;
        }

        return fact;

    }
}

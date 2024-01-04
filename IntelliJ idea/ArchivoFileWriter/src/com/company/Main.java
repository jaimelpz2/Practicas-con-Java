package com.company;

import java.io.File;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        File f=new File("d:\\archivosnumeros.txt");
        try{
            FileWriter fw=new FileWriter(f);//fw crea el flujo hacia f
            PrintWriter pw= new PrintWriter(fw);//permite la escritura en el archivo
            for(int i=1;i<=9;i++){
                pw.println(i);//se introduce e l valor de i en el archivo
                System.out.println(i);
            }
            fw.close();

        }catch(Throwable e){
            System.out.println("Error.. why? i dont know ");
        }
    }
}

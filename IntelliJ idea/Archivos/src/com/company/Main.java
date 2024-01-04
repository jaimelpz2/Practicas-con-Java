package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        File f= new File("e:\\archivosnumeros.txt");//Crea y  carga el archivo
                try{
                    FileReader fr=new FileReader(f);//Crea el fujo hacial
                    BufferedReader br=new BufferedReader(fr);//Permite la lectura
                    String linea="";//br.readLine();//linea toma el valor de la primera linea
                    while(linea!=null){//mientras haya datos en el archivo
                        linea=br.readLine();
                        System.out.println(linea);
                    }
                    fr.close();//Cierra el archivo

                }catch(Throwable e){
                    System.out.println("Error... no se ha" +
                            " podido acceder al archivo");//si no se pudo acceder al archivo

                }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSeleccion {

    public static void main(String[] args) {

        int id,edad,opc,aniosExperiencia,dorsal;
        String nombre,apellidos,titulacion,demarcacion,idfederacion;
        Scanner almacen = new Scanner(System.in);
        ArrayList<SeleccionFutbol> thunder=new ArrayList();

        do{
            System.out.println("");
            System.out.println("             M E N U");
            System.out.println("Introduzca la opcion que usted requiera");
            System.out.println("1.agregar un entrenador");
            System.out.println("2.agregar un futbolista");
            System.out.println("3.agregar un masajista");
            System.out.println("4.mostrar todo el equipo del estadio");
            System.out.println("5.C R E D I T O S");
            opc=almacen.nextInt();


            switch(opc){

                case 1:
                    System.out.println("Dame tu id (solo numeros)");
                    id=almacen.nextInt();
                    System.out.println("Dame tu nombre");
                    nombre=almacen.next();
                    System.out.println("Dame tus apellidos");
                    apellidos=almacen.next();
                    System.out.println("Registra tu edad");
                    edad=almacen.nextInt();
                    System.out.println("Registra tu idfederacion (letras)");
                    idfederacion=almacen.next();
                    thunder.add(new Entrenador (id,nombre,apellidos,edad,idfederacion));
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Dame tu id");
                    id=almacen.nextInt();
                    System.out.println("Dame tu nombre");
                    nombre=almacen.next();
                    System.out.println("Dame tus apellidos");
                    apellidos=almacen.next();
                    System.out.println("Registra tu edad");
                    edad=almacen.nextInt();
                    System.out.println("Registra tu dorsal");
                    dorsal=almacen.nextInt();
                    System.out.println("Dame tu demarcacion (letras)");
                    demarcacion=almacen.next();
                    thunder.add(new Futbolista(id,nombre,apellidos,edad,dorsal,demarcacion));
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Dame tu id");
                    id=almacen.nextInt();
                    System.out.println("Dame tu nombre");
                    nombre=almacen.next();
                    System.out.println("Dame tus apellidos");
                    apellidos=almacen.next();
                    System.out.println("Dame tu edad");
                    edad=almacen.nextInt();
                    System.out.println("Registra tu titulo (letras)");
                    titulacion=almacen.next();
                    System.out.println("Indica los anios de experiencia que llevas(numeros)");
                    aniosExperiencia=almacen.nextInt();
                    thunder.add(new Masajista(id,nombre,apellidos,edad,titulacion,aniosExperiencia));
                    System.out.println("");

                    break;

                case 4:
                    for(SeleccionFutbol comparar:thunder)
                        if(comparar instanceof Entrenador){
                            //Mostrar los siguientes terminos
                            System.out.println("");
                            System.out.println("Mostrar el id Entrenador si es dela clase :"+comparar.getId());
                            System.out.println("Mostrar el nombre del Entrenador si es dela clase:"+comparar.getNombre());
                            System.out.println("Mostrar los apellidos del Entrenador si es de dela clase:"+comparar.getApellidos());
                            System.out.println("Mostrar la edad del Entrenador si es de la clase:"+comparar.getEdad());
                            System.out.println("Mostrar la idfederacion del Entrenador si es de la clase:"+((Entrenador) comparar).getIdfederacion());
                        }
                        for(SeleccionFutbol comparar:thunder) {
                            if (comparar instanceof Futbolista) {
                                //Mostrar los siguientes terminos
                                System.out.println("");
                                System.out.println("Mostrar el id del Futbolista si es de la clase:" + comparar.getId());
                                System.out.println("Mostrar el nombre del Futbolista si es de la clase:" + comparar.getNombre());
                                System.out.println("Mostrar los apellidos del Futbolista si es de la clase:" + comparar.getApellidos());
                                System.out.println("Mostrar la edad del Futbolista si es de la clase:" + comparar.getEdad());
                                System.out.println("Mostrar la dorsal del Futbolista si es de la clase:" + ((Futbolista) comparar).getDorsal());
                                System.out.println("Mostrar la demarcacion del Futbolista si es de la clase:" + ((Futbolista) comparar).getDemarcacion());

                            }
                        }

                            for(SeleccionFutbol comparar:thunder){
                                if(comparar instanceof Masajista){
                                    //Mostrar los siguientes terminos
                                    System.out.println("");
                                    System.out.println("Mostrar el id del Masajista si es de la clase:"+comparar.getId());
                                    System.out.println("Mostrar el nombre del Masajista si es de la clase:"+comparar.getNombre());
                                    System.out.println("Mostrar los apellidos del Masajista si es de la clase:"+comparar.getApellidos());
                                    System.out.println("Mostrar la edad del Masajista si es de la clase:"+comparar.getEdad());
                                    System.out.println("Mostrar el titulo del Masajista si es de la clase:"+((Masajista) comparar).getTitulacion());
                                    System.out.println("Mostrar los anios de experiencia del Masajista si es de la clase:"+((Masajista) comparar).getAniosExperiencia());

                            }
                        }
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Realizado por: COMPARAN VELASCO JAIME ARMANDO");
                    System.out.println("Hecho en la universidad: TECNOLOGICO SUPERIOR DE ZAPOPAN");
                    System.out.println("Para la materia de: PROGRAMACION ORIENTADA A OBJETOS");
                    System.out.println("Con tal de entregar el 01/04/2019");
                    System.out.println("A cargo del maestro: RIGOBERTO LARIOS ");
                    System.out.println("S.A.C.V");
                    break;

            }

       }while(opc<6);


    }
}

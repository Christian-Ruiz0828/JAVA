package com.generation;

import com.generation.banco.cuentabancaria;
import com.sun.deploy.net.DownloadException;
import person.person;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;


    public static void main(String[] args) {

        System.out.println("antes de la division");
        try {
            division = division/denominador;
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
            System.out.println("Nullpointer");
        } catch (Exception ex){
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Soy fianlly");
        }
        System.out.println("despues de la division");





        /*
        person Person1 = new person (String);
        Person1.setName("Santiago");
        Person1.setAge(33);
        Person1.setId("102045455");
        System.out.println("Name: "+ Person1.getName());
        System.out.println("Age: "+ Person1.getAge());
        System.out.println("Id: " + Person1.getId());

        */



        /*
        cuentabancaria cuenta = new cuentabancaria();
        cuenta.setNombre("Christian Ruiz");
        cuenta.setClave("7nd67dj");
        cuenta.setSaldo(1022);

        cuenta.mostrarSaldo();
        System.out.println(cuenta.getNombre());
        */


        /*
        Animal animal = new Animal();
        animal.nombre = "iguana";


        persona Persona = new persona ();
        persona.nombre = "Christian";
        persona.edad = 19;
         */
    }
}

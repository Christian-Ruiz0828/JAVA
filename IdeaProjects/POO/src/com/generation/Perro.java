package com.generation;

public class Perro {

    String Nombre;
    String Raza;
    int edad;
    String tamanio;

    public Perro() {

    }

    public Perro(String Nombre) {
        this.Nombre = Nombre;
    }

    public Perro (String Nombre, String Raza) {
        this.Nombre = Nombre;
        this.Raza = Raza;
    }

    public Perro (String Nombre, String Raza, int edad, String tamanio) {
        this.Raza = Raza;
        this.Nombre = Nombre;
        this.edad = edad;
        this.tamanio = tamanio;
    }




    public void caracteristicas (){
        System.out.println("Hola mi nombre es " + this.Nombre + ", soy de raza " +
         this.Raza + " tengo " + this.edad + " años " + "soy de tamaño " + this.tamanio);
    }

    public void comer () {
        System.out.println("Estoy comiendo");
    }

    public void dormir (){
        System.out.println("Estoy durmiendo ZzzzZzzzZzz");
    }

    public void jugar (){
        System.out.println("Estoy jugando");
    }

}

package com.generation;

public class Main {

    public static void main(String[] args) {

        Perro lomito = new Perro ();
        lomito.Nombre = "Chems";
        lomito.edad = 19;
        lomito.Raza = "Callejero";
        lomito.tamanio = "Grande";
        lomito.caracteristicas();
        lomito.comer();


        Perro lomito2= new Perro ();
        lomito2.Nombre = "Hitler";
        lomito2.edad = 10;
        lomito2.Raza = "Gran Danes";
        lomito2.tamanio = "small";
        lomito2.caracteristicas();
        lomito2.dormir();


        Perro lomito3 = new Perro("Milaneso", "chihuaha");

        Perro lomito4 = new Perro("Sr.bigotes", "Husky", 19, "grande");
        lomito4.caracteristicas();
    }
}

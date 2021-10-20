package com.generation;


import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar("Christian Ruiz");
        System.out.println(mensaje);
        int resultado = suma (5,3);
        System.out.println(resultado);
        alerta("Mensaje de prueba");
        */
        /*
        System.out.println(Math.PI);
        double num1 = 13.75;
        double num2 = 23.12;

        System.out.println(Math.ceil(num1)); */

        String mensaje1 = "Hola";
        String mensaje2 = "Hol";
        System.out.println(mensaje1.length());
        //equals compara dos strings y devuelve verdadero sin son iguales
        //equalsIgnoreCase compara dos strings sin importar si estas escritas en mayusculas o minusculas
        //
        System.out.println(mensaje1.equals(mensaje2));
        System.out.println(mensaje1.toUpperCase());
    }

    public static String saludar(String nombre){
        return "Hola, como estas " + nombre;
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /*public static void alerta(String mensaje){
        return "Mensaje de prueba";
    }*/

}

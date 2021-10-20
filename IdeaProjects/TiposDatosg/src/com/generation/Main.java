package com.generation;

public class Main {

    public static void main(String[] args) {
        // asi se haria en JS const nombre = 'Christian Pérez';
        //variable string
        String nombre = "Christian Pérez";

        //Datos primitivos numericos
        byte num1 = 10;
        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        /*varlores flotantes, se tiene que agregar una f y d al final*/

        float decimal1 = 10.23434f;
        double decimal2 = 20.93894858d;

        //dato primitivo char se debe escribir siempre con comillas simples
        char character = 'f';

        //dato primitivo boolean
        boolean verdadero = true;


        short numShort1 = num1;
        int numInt = numShort1;
        short numshor2 = (short) numInt;

        /*byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short) (numByte1 + numByte2);*/



        /*System.out.println(suma);
        System.out.println(numshor2*/

        //Operadores aritmeticos en Java
        // + sumar
        // - restar
        // * multiplicar
        // / dividir
        // % residuo
        //+, -, *, /, %


        byte numByte1s = 80;
        double numByte2s = 345;
        short suma = (short) (numByte1s + numByte2s);

        byte numByte1r = 56;
        byte numByte2r = 77;
        short resta = (short) (numByte1r - numByte2r);


        int numByte1m = 5;
        int numByte2m = 5;
        int multiplicacion =  (numByte1m * numByte2m);


        byte num1d = 7;
        byte num2d = 3;
        short division =  (short) (num1 / num2);


        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);







    }
}

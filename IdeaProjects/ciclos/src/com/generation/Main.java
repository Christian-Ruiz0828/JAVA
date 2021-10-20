package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ciclo for
        /*
        for (contado = 0; contador < numero; contador++){
            //codigo que se repite;
        }
        */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingreso un numero");
        int numero = sc.nextInt();
        sc.close();

        for (int i = 1; i <=10; i++) {

            if( i%2 == 0){
                continue;
            }

            System.out.println(numero + "x" + i + "=" + (numero*i)); */

           /* if(i == 8) {
                //para detener nuestro ciclo
                break;
            }*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero");
        int numero = sc.nextInt();
        sc.close();
        int = 0;
        int = 1;
        int suma = 1;
        for (int i = 0; i < numero ; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        */

        /* ciclo while mientras la condicion se cumpla se va a repetir el codigo*/

 /*       Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto. Ingresa un numero");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while (numero != numeroSecreto) {
            System.out.println("Adivina el numero secreto. ingresa un numero");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("Adivina el numero secreto. ingresa un numero");
*/


      /*  Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;
        do{
            System.out.println("Adivina el numero secreto. ingresa un numero");
            numero = sc.nextInt();
        }
        while (numero != numeroSecreto);

        sc.close();
        System.out.println("felciidades");
        */
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int factorial = 1;
        int total = 1;
        System.out.println("ingresa un numero");

        do{
            total *= factorial;
            factorial--;
        } while(factorial>0);

        sc.close();
        System.out.println("El valor total del factorial es =" + total) ;

    }
    }

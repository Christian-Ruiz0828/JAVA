package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
        String frutas[] = new String[]{"manza, mango, fresa, pera, piña"};
        frutas[0] ="manzana";
        frutas[1] ="mango";
        frutas[2] ="fresa";
        frutas[3] ="pera";
        frutas[4] ="piña";

        frutas[5] ="cereza";
        frutas[6] ="melon";
        frutas[7] ="guayaba";
        frutas[8] ="sandia";

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
*/
        /*

        Set<String> frutas = new HashSet<>(6);
        //Caracteristicas principales Set
        //No puede contener elementos duplicados
        //el orden de los elementos puede variar
        frutas.add("mango");
        frutas.add("fresa");
        frutas.add("piña");
        frutas.add("lima");
        frutas.add("melon");
        frutas.add("uva");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        */

        System.out.println("---------------------------");

        Set<String> frutas2 = new TreeSet<>();
        //Es mas lento que el HashSet
        //ordena los elementos alfabeticamente

        frutas2.add("mango");
        frutas2.add("fresa");
        frutas2.add("piña");
        frutas2.add("lima");
        frutas2.add("melon");
        frutas2.add("uva");

        for (String fruta : frutas2) {
            System.out.println(fruta);
        }

        System.out.println("---------------------------");

        Set<String> frutas3 = new LinkedHashSet<>();
        //almacena los elementos en orden de insercción
        frutas3.add("mango");
        frutas3.add("fresa");
        frutas3.add("piña");
        frutas3.add("lima");
        frutas3.add("melon");
        frutas3.add("uva");

        for (String fruta : frutas3) {
            System.out.println(fruta);
        }

        System.out.println("--------------------------- Lista array");

        List<String> frutas4 = new ArrayList<>();
        //Lis si admite elementos duplicados
        frutas4.add("mango");
        frutas4.add("fresa");
        frutas4.add("piña");
        frutas4.add("lima");
        frutas4.add("melon");
        frutas4.add("uva");
        frutas4.add("mango");
        for (String fruta : frutas4) {
            System.out.println(fruta);
        }

        System.out.println("--------------------------- Element Lista array");

        System.out.println((3));
        int indice = frutas4.indexOf("melon");
        System.out.println(frutas4.get(indice));

        System.out.println("--------------------------- Linked Lista array");

        List<String> frutas5 = new LinkedList<>();
        frutas5.add("mango");
        frutas5.add("fresa");
        frutas5.add("piña");
        frutas5.add("lima");
        frutas5.add("melon");
        frutas5.add("uva");

        for (String fruta : frutas5) {
            System.out.println(fruta);
        }

        System.out.println("--------------------------- Map");

        Map<Integer, String> universidades = new HashMap<Integer, String>();
        //asocia claves con valores
        //No puede tener claves repetidas
        //solo puede tener un valor asociado a la clave
        universidades.put(1,"IPN");
        universidades.put(2,"UNAM");
        universidades.put(3,"UAEM");
        universidades.put(4,"UAM");
        universidades.put(5,"TESCO");

        for (Map.Entry<Integer, String> universidad : universidades.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }

        System.out.println(universidades.get(2));




    }
}

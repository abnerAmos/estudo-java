package com.abner.estudoJava.javaBasico.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

    public static void main(String[] args) {

        // Set: Utilizado para garantir que um item não será repetido.

        // HashSet: Tem um retorno mais rapido, porém não garante ordem de itens.
        // TreeSet: Tem um retorno lento, porém garante ordem alfabética.
        /* LinkedSet: Tem um retorno mediano, garante ordem alfabética
           (possui uma lógica particular na inserção de dados no meio da lista). */

//        Set<String> nomes = new HashSet<>();
//        Set<String> nomes = new TreeSet<>();
        Set<String> nomes = new LinkedHashSet<>();

        nomes.add("Abner Amos");
        nomes.add("Abner Amos");
        nomes.add("Erik Gonzaga");
        nomes.add("Erik Gonzaga");
        nomes.add("Edney Ronan");
        nomes.add("Edney Ronan");
        nomes.add("Ricardo Jonas");
        nomes.add("Ricardo Jonas");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}

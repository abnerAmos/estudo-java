package com.abner.estudoJava.javaBasico.collection;

import java.util.HashSet;
import java.util.Set;

public class SetList {

    public static void main(String[] args) {

        // SetList: Utilizado para garantir que um item não será repetido.

        Set<String> nomes = new HashSet<>();

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

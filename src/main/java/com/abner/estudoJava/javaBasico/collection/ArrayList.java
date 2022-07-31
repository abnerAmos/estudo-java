package com.abner.estudoJava.javaBasico.collection;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        // Outra forma de se criar Array List sem ter que informar o tamanho da lista.

        List<String> nomes = new java.util.ArrayList<>();

        nomes.add("Abner Amos");
        nomes.add("Erik Gonzaga");
        nomes.add("Edney Ronan");
        nomes.add("Ricardo Jonas");

        System.out.println(nomes);

        Integer tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.forEach(percorrer -> {
            System.out.println(percorrer);
        });
    }
}

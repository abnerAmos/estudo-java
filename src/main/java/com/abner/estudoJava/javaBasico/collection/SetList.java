package com.abner.estudoJava.javaBasico.collection;

import java.util.*;

public class SetList {

    public static void main(String[] args) {

        // Set: Utilizado para garantir que um item não será repetido.

        // HashSet: Tem um retorno mais rapido, porém não garante ordem de itens.
        // TreeSet: Tem um retorno lento, porém garante ordem alfabética.
        /* LinkedSet: Tem um retorno mediano, armazena dados na ordem em que se foi inserido.
           (possui uma lógica particular na inserção de dados no meio da lista). */

//        Set<String> nomes = new HashSet<>();
        Set<String> nomes = new TreeSet<>();
//        Set<String> nomes = new LinkedHashSet<>();

        nomes.add("Abner Amos");
        nomes.add("Abner Amos");
        nomes.add("Erik Gonzaga");
        nomes.add("Erik Gonzaga");
        nomes.add("Edney Ronan");
        nomes.add("Edney Ronan");
        nomes.add("Ricardo Jonas");
        nomes.add("Ricardo Jonas");

        nomes.remove("Ricardo Jonas");
        nomes.removeIf(x -> x.charAt(0) == 'A');

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Set<Integer> numbersA = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> numbersB = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // Uniao - Mescla as duas listas em ordem, e remove os repetidos.
        Set<Integer> numbersC = new TreeSet<>(numbersA);
        numbersC.addAll(numbersB);
        System.out.println(numbersC);

        // Interseccao - Retorna apenas os itens repetidos entre as duas listas.
        Set<Integer> numbersD = new TreeSet<>(numbersA);
        numbersD.retainAll(numbersB);
        System.out.println(numbersD);

        // Diferenca - Retorna os itens da lista A que não contem na lista B.
        Set<Integer> numbersE = new TreeSet<>(numbersA);
        numbersE.removeAll(numbersB);
        System.out.println(numbersE);
    }
}

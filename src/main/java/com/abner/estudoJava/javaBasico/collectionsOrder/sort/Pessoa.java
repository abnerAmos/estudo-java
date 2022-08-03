package com.abner.estudoJava.javaBasico.collectionsOrder.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa {

    public static void main(String[] args) {

        List<OrdenacaoSort> pessoas = new ArrayList<>();
        pessoas.add(new OrdenacaoSort(35, "Erik", "Gonzaga"));
        pessoas.add(new OrdenacaoSort(29, "Abner", "Amos"));
        pessoas.add(new OrdenacaoSort(40, "Edney", "Ronan"));

        System.out.println("desordenado \n");
        for (OrdenacaoSort s : pessoas) {
            System.out.println(s.getNome());
        }

        System.out.println("---------");
        Collections.sort(pessoas);

        System.out.println("ordenado \n");
        for (OrdenacaoSort s : pessoas) {
            System.out.println(s.getNome());
        }
    }
}
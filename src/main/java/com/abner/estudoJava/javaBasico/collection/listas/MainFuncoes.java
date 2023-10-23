package com.abner.estudoJava.javaBasico.collection.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainFuncoes {

    public static void main(String[] args) {

        Funcoes f1 = new Funcoes("Estudante", "Fundamental");
        Funcoes f2 = new Funcoes("Dev Web", "Jr");
        Funcoes f3 = new Funcoes("Enfemeira", "Tecnico");

        List<Funcoes> funcoes = new ArrayList<>();

        funcoes.add(f1);
        funcoes.add(f2);
        funcoes.add(f3);

        System.out.println(funcoes);

        // Ordenando lexograficamente através do método compareTo na classe de pessoas.
        Collections.sort(funcoes);
        System.out.println(funcoes);

        // Utilizando Comparator de reference methods para ordenar através de outro atributo.
        funcoes.sort(Comparator.comparing(Funcoes::getLevel));
        System.out.println(funcoes);
    }
}

package com.abner.estudoJava.javaBasico.collection.listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainPessoas {

    public static void main(String[] args) {

        Pessoas p1 = new Pessoas("Juliana Menezes", 26);
        Pessoas p2 = new Pessoas("Anna Beatriz", 9);
        Pessoas p3 = new Pessoas("Abner Amos", 30);

        Collection<Funcoes> funcoesImutaveis = p1.getFuncoes();

        p1.adiciona(new Funcoes("Estudante", "Fundamental"));
        p1.adiciona(new Funcoes("Dev Web", "Jr"));
        p1.adiciona(new Funcoes("Enfemeira", "Tecnico"));
        System.out.println(funcoesImutaveis);

        List<Funcoes> funcoes = new ArrayList<>(funcoesImutaveis);
        Collections.sort(funcoes);
        System.out.println(funcoes);
        funcoes.forEach(System.out::println);

        List<Pessoas> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        var stream = pessoas.stream().mapToInt(Pessoas::getAge).sum();
        System.out.println(stream);
    }
}

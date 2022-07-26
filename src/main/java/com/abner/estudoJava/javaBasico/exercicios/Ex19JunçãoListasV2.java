package com.abner.estudoJava.javaBasico.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Ex19JunçãoListasV2 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Abner");
        nomes.add("Ronan");
        nomes.add("Erik");
        nomes.add("Ricardo");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Filipe");
        nomes2.add("Thabita");
        nomes2.add("Junior");
        nomes2.add("Daniel");

        nomes.addAll(nomes2);

        System.out.println(nomes);
        System.out.println("----------------------------------------------------------------");

        List<String> pessoas = new ArrayList<>(List.of("Joao", "Celio", "Valter", "Gabriel"));
        List<String> pessoas2 = List.of("Vini", "Mauricio", "Tiana", "Jovi");

        pessoas.addAll(pessoas2);
        System.out.println(pessoas);



    }
}

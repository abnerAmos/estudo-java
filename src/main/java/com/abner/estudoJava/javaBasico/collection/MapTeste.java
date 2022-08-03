package com.abner.estudoJava.javaBasico.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTeste {

    public static void main(String[] args) {

        // Map: Possui uma Chave e um Valor, ao ser informado a Chave retorna o Valor.
        // funcionalidade similar ao Switch.

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um nome para saber a idade");
        String nome = input.nextLine().toUpperCase();

        Map<String, Integer> nomes = new HashMap<>();

        nomes.put("ABNER AMOS", 29);
        nomes.put("ERIK GONZAGA", 35);
        nomes.put("EDNEY RONAN", 40);
        nomes.put("RICARDO JONAS", 31);

        Integer idade = nomes.get(nome);

        System.out.println(idade);





    }
}

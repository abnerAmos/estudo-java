package com.abner.estudoJava.javaBasico.collection.exemplosSimples;

import java.util.*;

public class MapTeste {

    public static void main(String[] args) {

        /* Map: Possui uma Chave e um Valor, ao ser informado a Chave retorna o Valor.
            funcionalidade similar ao Switch.
            * Igual ao Set, também não permite Chaves iguais.

        * HashMap: Tem um retorno mais rapido, porém não garante ordem de itens.
        * TreeMap: Tem um retorno lento, porém garante ordem alfabética.
        * LinkedMap: Tem um retorno mediano, armazena dados na ordem em que se foi inserido.
           (possui uma lógica particular na inserção de dados no meio da lista). */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Informe um nome para saber a idade");
//        String nome = input.nextLine().toUpperCase();

//        Map<String, Integer> nomes = new HashMap<>();
        Map<String, Integer> nomes = new TreeMap<>();
//        Map<String, Integer> nomes = new LinkedHashMap<>();

        nomes.put("ABNER AMOS", 29);
        nomes.put("ERIK GONZAGA", 35);
        nomes.put("EDNEY RONAN", 40);
        nomes.put("RICARDO JONAS", 31);

        nomes.put("ERIK GONZAGA", 38); // Caso exista uma chave já existente, o valor é reescrito se diferente.
        nomes.remove("ABNER AMOS");

        for (String keyValue : nomes.keySet())
            System.out.println(keyValue + " : " + nomes.get(keyValue)); // Retorna Chave e Valor.

        System.out.println();

        for (String key : nomes.keySet())
            System.out.println(key); // Retorna apenas Chave.

        System.out.println();

        for (String value : nomes.keySet())
            System.out.println(nomes.get(value)); // ".get" Retorna apenas Valor.
    }
}

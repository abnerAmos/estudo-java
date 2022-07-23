package com.abner.estudoJava.javaBasico.materiasDiversas.ponteiros;

public class Exemplo2 {

    public static void main(String[] args) {

        // Se criar um objeto com um valor, e outro como copia do primeiro, ambos irão possuir a mesma referência.
        // Porem se a copia for alterada o valor, o valor do original também será alterada.

        Pessoa p1 = new Pessoa();
        p1.nome = "Abner";

        Pessoa p2 = p1;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        p2.nome = "Erik";

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        String comparar = (p1 == p2) ? "Iguais" : "Diferentes";

        System.out.println(comparar);


    }
}

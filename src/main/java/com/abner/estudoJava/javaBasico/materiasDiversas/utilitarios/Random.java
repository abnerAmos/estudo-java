package com.abner.estudoJava.javaBasico.materiasDiversas.utilitarios;

public class Random {

    public static void main(String[] args) {

        // Toda vez que executado gera automaticamente um numero aleatório;
        // o numero dentro de "bound" determina até que numero será gerado numeros aleatórios
        // +1 determina que sempre será gerado numeros positivos

        Integer id = new java.util.Random().nextInt(10) + 1;

        // os numeros dentro de "bound" determina o intervalo de numeros que serão gerados aleatóriamente
        // + 1 determina que sempre será gerado numeros positivos
        // + 50 determina o numero mais baixo gerado
        // Sempre deve se respeitar a regra do numero maior primeiro

        Integer id2 = new java.util.Random().nextInt((100 - 50) + 1) + 50;
        System.out.println(id);
        System.out.println(id2);
    }
}

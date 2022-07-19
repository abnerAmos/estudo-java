package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class DecrementoWhile {

    public static void main(String[] args) {

        int indice = 55;

        while (indice >= 5) {
            System.out.println(indice);

            indice = indice -5;

            // ou: indice--

        }

        System.out.println("fim do laco");
    }
}
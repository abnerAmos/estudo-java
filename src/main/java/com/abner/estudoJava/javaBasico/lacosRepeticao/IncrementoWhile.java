package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class IncrementoWhile {

    public static void main(String[] args) {

        int indice = 5;

        while (indice <= 50) {
            System.out.println(indice);

            indice = indice +5;

            // ou: indice++

        }

        System.out.println("fim do laco");
    }
}
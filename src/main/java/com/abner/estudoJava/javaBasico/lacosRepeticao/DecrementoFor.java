package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class DecrementoFor {

    public static void main(String[] args) {

        for (int indice = 100; indice >= 0; indice = indice - 10) {
            System.out.println(indice);

        }

        System.out.println("fora do laco");

        // Abreviação utilizada

        for (int i = 100; i > 0; i--) {
            System.out.println(i);

            // i-- Representa i = i - 1;

        } System.out.println("fora do laco");
    }
}
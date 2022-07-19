package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class IncrementoFor {

    public static void main(String[] args) {

        for (int indice = 0; indice <= 100; indice = indice + 10) {
            System.out.println(indice);

        } System.out.println("fora do laco");

        // Abreviação utilizada

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);

            // i++ Representa i = i + 1;

        } System.out.println("fora do laco");
    }
}
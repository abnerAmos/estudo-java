package com.abner.estudoJava.javaBasico.materiasDiversas.exceptions;

public class tryCatch {

    public static void main(String[] args) {

        System.out.println("Executando linha de código 1");

        try {
            int teste = Integer.parseInt("Hello World!");
            System.out.println("Executando linha de código 2" + teste);

        } catch (NumberFormatException t) {
            System.out.println("Formato Inválido!");

        } finally {
            System.out.println("Executa Independente de qualquer coisa!");
        }

        System.out.println("Executando linha de código 3");


    }
}

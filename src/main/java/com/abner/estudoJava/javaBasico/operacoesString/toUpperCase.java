package com.abner.estudoJava.javaBasico.operacoesString;

public class toUpperCase {

    public static void main(String[] args) {

        // Deixa o texto em maiusculo

        String texto = "Aula de Programacao";
        System.out.println(texto);

        texto = texto.toUpperCase();
        System.out.println(texto);

        // Deixa o texto em minusculo

        texto = texto.toLowerCase();
        System.out.println(texto);
    }
}
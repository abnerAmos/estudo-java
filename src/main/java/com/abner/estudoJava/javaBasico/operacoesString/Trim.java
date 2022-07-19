package com.abner.estudoJava.javaBasico.operacoesString;

public class Trim {

    public static void main(String[] args) {

        // Remove espaços contidos no começo e fim de uma palavra

        String texto = "        Aula de Programacao ";
        System.out.println(texto);

        texto = texto.trim();
        System.out.println(texto);
    }
}
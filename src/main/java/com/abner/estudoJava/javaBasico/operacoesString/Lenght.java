package com.abner.estudoJava.javaBasico.operacoesString;

public class Lenght {

    public static void main(String[] args) {

        // Obtem o tamanho de uma String (espaços são contados)

        String texto = "Aula de Programação";
        int tamanho = texto.length();

        System.out.println(tamanho);

        // Percorrendo todas as letras com for

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            System.out.println(letra);
        }

        System.out.println();

        // Percorrendo todas as letras ao contrário

        for (int i = texto.length() -1; i >= 0; i--) {
            char letra = texto.charAt(i);
            System.out.println(letra);
        }
    }
}
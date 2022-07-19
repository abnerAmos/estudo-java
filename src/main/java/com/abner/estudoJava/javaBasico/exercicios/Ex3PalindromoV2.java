package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex3PalindromoV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma palavra");
        String palavra = input.next().toLowerCase();
        palindromo(palavra);
    }

    static void palindromo (String palavra) {

        String palavraInvertida = "";

        for (int i = palavra.length() -1; i >= 0; i--) {
            char letra = palavra.charAt(i);
            palavraInvertida = palavraInvertida + letra;

        } String resposta = (palavraInvertida.equals(palavra)) ? "Palindromo" : "Não é Palindromo";
        System.out.println(resposta);
    }
}

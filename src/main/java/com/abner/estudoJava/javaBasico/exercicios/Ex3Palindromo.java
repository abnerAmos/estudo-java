package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex3Palindromo {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira uma palavra");
    String palavra = input.next();

    String palavraInvertida = "";

    for (int i = palavra.length() -1; i >= 0; i--) {
        char letra = palavra.charAt(i);
        palavraInvertida = palavraInvertida + letra;

    } if (palavraInvertida.equals(palavra))
        System.out.println("Palindromo");

        else {
            System.out.println("Não é Palindromo");
        }
    }

}

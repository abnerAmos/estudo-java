package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex14ContaPalavra {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira um texto com palavra repetidas:");
    String texto = input.nextLine();

    System.out.println("Insira a palavra a ser contada:");
    String palavra = input.nextLine();

    int contaPalavra = 0;

    while (texto.contains(palavra)) {
        int index = texto.indexOf(palavra);
        texto = texto.substring(index + palavra.length());
        contaPalavra++;

    } System.out.println("Total de vezes que a palavra apareceu no texto: " + contaPalavra);


    }
}

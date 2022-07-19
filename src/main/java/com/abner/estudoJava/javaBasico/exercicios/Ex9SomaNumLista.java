package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex9SomaNumLista {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira uma sequencia de numeros separados por virgula: ");
    String numeros = input.next();
    String[] listaNumeros = numeros.split(",");

    int soma = 0;

    for (int i = 0; i < listaNumeros.length; i++) {
        int total = Integer.parseInt(listaNumeros[i]);
        soma += total;
    }
        System.out.println("Soma da Lista é: " + soma);
    }
}

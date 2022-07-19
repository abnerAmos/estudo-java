package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex5Fibonacci {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe um número para saber a sequência Fibonacci:");
    int numero = input.nextInt();

    int numeroAtual = 0;
    int numeroAnterior = 0;

    for (int i = 1; i <= numero; i++) {
        if (numeroAtual > numero)
            break;
        System.out.println(numeroAtual);

        if (i == 1) {
            numeroAtual = 1;

        } else {
            numeroAtual = numeroAtual + numeroAnterior;
            numeroAnterior = numeroAtual - numeroAnterior;
        }
    }
    }
}

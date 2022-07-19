package com.abner.estudoJava.javaBasico.exercicios;

import  java.util.Scanner;
public class Ex9NumMaiorMenor {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe uma sequencia de numeros: ");
    String numeros = input.next();
    String[] listaNumeros = numeros.split(",");

    int numeroMaior = Integer.parseInt(listaNumeros[0]);
    int numeroMenor = Integer.parseInt(listaNumeros[0]);

        for (int i = 1; i < listaNumeros.length; i++) {
            int valorAtual = Integer.parseInt(listaNumeros[i]);

            if (valorAtual > numeroMaior) {
                numeroMaior = valorAtual;
            }

        } System.out.println(numeroMaior);

        for (int i = 1; i < listaNumeros.length; i++) {
            int valorAtual = Integer.parseInt(listaNumeros[i]);

            if (valorAtual < numeroMenor) {
                numeroMenor = valorAtual;
            }

        } System.out.println(numeroMenor);
    }
}

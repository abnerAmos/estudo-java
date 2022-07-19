package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex9ContagemNumIguais {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira uma sequencia de numeros separados por virgula: ");
    String numeros = input.next();
    String[] listaNumeros = numeros.split(",");

    int contador = 0;

    for (int i = 0; i < listaNumeros.length; i++) {
        if (listaNumeros[i].equals("10")) {
            contador++;
        }
    }
        System.out.println("Quantos numeros Dez há na lista: " + contador);
    }
}

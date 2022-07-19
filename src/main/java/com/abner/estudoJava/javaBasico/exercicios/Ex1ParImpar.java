package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex1ParImpar { // Verificando se um numero é par ou ímpar.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe um numero:");
        int numero = input.nextInt();

        if(numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex1ParImparV2 {

    // Encurtando/Melhorando código do exercicio: Verificar se um numero é par ou impar.
    // Substituido if e else por Operador Ternário.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int numero = input.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);
    }
}

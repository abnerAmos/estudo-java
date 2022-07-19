package com.abner.estudoJava.javaBasico.exerciciosNivel2;

import java.util.Scanner;
public class Ex3Idade2050 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        double anoNascimento = input.nextDouble();

        System.out.println("Informe o ano atual: ");
        double anoAtual = input.nextDouble();

        double idadeAtual = anoAtual - anoNascimento;
        double idade2050 = 2050 - anoNascimento;

        System.out.println("Sua idade atual é: " + idadeAtual);
        System.out.println("Sua idade em 2050 será: " + idade2050);
    }

}

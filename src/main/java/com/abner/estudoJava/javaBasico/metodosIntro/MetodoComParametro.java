package com.abner.estudoJava.javaBasico.metodosIntro;

import java.util.Scanner;
public class MetodoComParametro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento:");
        int idade = calculoIdade(input.nextInt(), 2022);    // Dados de entrada (Parametros/argumentos)
        System.out.println(idade);
    }
    static int calculoIdade(int anoNasc, int anoAtual) {        // <-- Metodos com retorno, pode-se capturar o valor de uma variável

        int idadeAtual = anoAtual - anoNasc;
        return idadeAtual;                                           // Dados de saída (return)
    }
}
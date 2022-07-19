package com.abner.estudoJava.javaBasico.metodosIntro;

public class MetodoComRetorno {

    public static void main(String[] args) {

        int idade = idadeAtual();                                                          // <--------  -- v
        System.out.println("Este ano você completa " + idade + " anos");
    }

    static int idadeAtual() {                                 // O tipo do método (int) se declara no mesmo ^
        int anoNascimento = 1993;
        int anoAtual = 2022;
        int idadeAtual = anoAtual - anoNascimento;
        return idadeAtual;                                      // Dados de Saída (return)
    }

}
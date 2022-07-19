package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex22ExibirIniciais {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um nome: ");
        String nomeSimples = input.nextLine();
        String nome = nomeSimples.toUpperCase();

        if (nome.contains(" DA ") || nome.contains(" DE ") || nome.contains(" DO ") || nome.contains(" DAS ") || nome.contains(" DOS "));
        nome = nome.replaceAll(" DA ", " ");
        nome = nome.replaceAll(" DE ", " ");
        nome = nome.replaceAll(" DO ", " ");
        nome = nome.replaceAll(" DOS ", " ");
        nome = nome.replaceAll(" DAS ", " ");

        String[] nome2 = nome.split(" ");

        for (int i = 0; i < nome2.length; i++) {
            char iniciais = nome2[i].charAt(0);
            System.out.println(iniciais);
        }
    }
}
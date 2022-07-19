package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex22ExibirIniciaisV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = input.nextLine().toUpperCase();
        String iniciais = "";

        String[] preposicao = {" DA ", " DE ", " DO ", " DAS ", " DOS "};
        for (String tipoPreposicao : preposicao)
            nome = nome.replaceAll(tipoPreposicao, " ");

        String[] nomeNovo = nome.split(" ");
        for (String n : nomeNovo)
            iniciais = iniciais + n.charAt(0);

        System.out.println(iniciais);



    }
}
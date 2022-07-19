package com.abner.estudoJava.javaBasico.operacoesString;

public class Substring {

    public static void main(String[] args) {

        // Extrai um texto/palavra de outro texto

        String texto = "Aula de Programacao";

        // Para captar o texto/palavra necessário informar o index inicial e index final +1

        String subtexto1 = texto.substring(0, 4);
        String subtexto2 = texto.substring(5, 7);

        // Quando não informado o index final, percorre a String até o fim

        String subtexto3 = texto.substring(8);

        System.out.println(subtexto1);
        System.out.println(subtexto2);
        System.out.println(subtexto3);
    }
}
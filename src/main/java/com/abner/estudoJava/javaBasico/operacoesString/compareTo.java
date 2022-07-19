package com.abner.estudoJava.javaBasico.operacoesString;

public class compareTo {

    public static void main(String[] args) {

        // Verifica se um texto é maior que outro em termos de ordem alfabética (lexicograficamento)
        // Resposta com numero positivo = Vem depois (maior)
        // Resposta com numero negativo = Vem antes (menor)
        // Letras maiusculas sempre vem antes


        String nome = "Juliana";    // = 9 (maior)
        String nome2 = "Abner";     // = -9 (menor)

        int comparacao = nome.compareTo(nome2);
        int comparacao2 = nome2.compareTo(nome);

        System.out.println(comparacao);
        System.out.println(comparacao2);
    }
}
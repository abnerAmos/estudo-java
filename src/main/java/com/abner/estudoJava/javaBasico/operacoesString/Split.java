package com.abner.estudoJava.javaBasico.operacoesString;

public class Split {

    public static void main(String[] args) {

        // Transforma uma String em Array com base em um separador (sem espaços)

        String texto = "Abner/Juliana/Beatriz/Livia/Lara/Alicia";
        String[] nomes = texto.split("/");

        System.out.println(nomes.length);
        System.out.println(nomes[2]);
    }
}

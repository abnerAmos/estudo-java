package com.abner.estudoJava.javaBasico.intro;

public class ArrayString {

    public static void main(String[] args) {

        String[] nomes = new String[6];

        int tamanhoLista = nomes.length;

        nomes[0] = "Abner";
        nomes[1] = "Juliana";
        nomes[2] = "Anna";
        nomes[3] = "Alicia";
        nomes[4] = "Livia";
        nomes[5] = "Lara";

        String nome1 = nomes[0];
        String nome2 = nomes[1];
        String nome3 = nomes[2];
        String nome4 = nomes[3];
        String nome5 = nomes[4];
        String nome6 = nomes[5];

        System.out.println(tamanhoLista);
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome3);
        System.out.println(nome4);
        System.out.println(nome5);
        System.out.println(nome6);

    }
}
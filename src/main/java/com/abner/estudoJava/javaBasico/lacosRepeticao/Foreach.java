package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class Foreach {

    public static void main(String[] args) {

        // Forma e simplificada de for

        // lado esquerdo de : recebe o elemento (tipo/variavel) (declaração) corrente da lista (String, int, double)
        // lado direito de  : recebe a lista (atribuir)

        String lista = "1,2,3,4,5,6,7,8,9";
        String aux = "";                         // utiliza para armazenar lista em apenas uma linha

        String[] lista2 = lista.split(",");

        for (String e : lista2) {                   // foreach (for implicito)
            aux = aux + e;
            System.out.println(e);                  // "e" percorre a lista
        }
        System.out.println(aux);                 // "a2" armazena a lista em apenas uma linha
    }
}
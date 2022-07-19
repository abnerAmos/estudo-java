package com.abner.estudoJava.javaBasico.exercicios;

public class Ex7OrdenacaoAlfa {

    public static void main(String[] args) {

        System.out.println("LISTA SEM ORDEM:");
        String[] nomes = {"Erik", "Ronan", "Abner", "Hiago", "Filipe", "Ricardo"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println();
        System.out.println("ORDENAÇÃO CRESCENTE:");
        for (int i = 0; i < nomes.length; i++) {
            for (int ii = i + 1; ii < nomes.length; ii++) {
                if (nomes[i].compareTo(nomes[ii]) > 0) {
                    String aux = nomes[i];
                    nomes[i] = nomes[ii];
                    nomes[ii] = aux;
                }
            }
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println();
        System.out.println("ORDENAÇÃO DECRESCENTE:");
        for (int i = 0; i < nomes.length; i++) {
            for (int ii = i + 1; ii < nomes.length; ii++) {
                if (nomes[i].compareTo(nomes[ii]) < 0) {
                    String aux = nomes[i];
                    nomes[i] = nomes[ii];
                    nomes[ii] = aux;
                }
            }
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}

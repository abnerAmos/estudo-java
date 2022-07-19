package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class BreakWhile {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;

        while(i < numeros.length) {

            if (numeros[i] % 2 == 0) {
                if (i == 5)
                    break;
            }
            System.out.println(numeros[i]);
            i++;

        } System.out.println("Fim do laço");
    }
}
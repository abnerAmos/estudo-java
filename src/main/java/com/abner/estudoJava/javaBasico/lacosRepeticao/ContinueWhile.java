package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class ContinueWhile {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;

        while(i < numeros.length) {

            if (numeros[i] % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(numeros[i]);
            i++;
        }
    }
}
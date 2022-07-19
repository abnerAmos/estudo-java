package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex7OrdenacaoNum {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("LISTA DESORDENADA");
        int[] numeros = {2,4,6,5,3,1,10,7,9,8};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++)
        {

            for (int j = i+1; j < numeros.length; j++) {

                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("LISTA ORDENADA");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++)
        {

            for (int j = i+1; j < numeros.length; j++) {

                if (numeros[i] < numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        System.out.println();
        System.out.println("LISTA INVERSA");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}

package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class ContinueFor {

    public static void main(String[] args) {

        // exibindo apenas numeros ímpares
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; numeros[i] < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {                      // Enquanto if tiver apenas 1 linha {} não é obrigatório
                continue;

            } System.out.println(numeros[i]);

        } System.out.println("Fim de Laço");
    }
}
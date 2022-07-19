package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex4NumPrimoV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero:");
        int numPrimo = input.nextInt();

        int numDivisores = 0;

        for (int i = 1; i <= numPrimo; i ++){
            if (numPrimo % i == 0){
                numDivisores++;
            }
        } String numeroPrimo = (numDivisores == 2) ? "É Primo" : "Não é Primo";
        System.out.println(numeroPrimo);
    }
}

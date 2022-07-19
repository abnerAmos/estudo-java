package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex4NumPrimo {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira um numero:");
        int numPrimo;
        int numDivisores = 0;


        numPrimo = input.nextInt();

        for(int i = 1; i <= numPrimo; i ++){
            if(numPrimo % i == 0){
                numDivisores++;
            }
        }

        if (numDivisores == 2){

            System.out.println("É Primo");
        } else {
            System.out.println("Não é Primo");
        }
    }




}
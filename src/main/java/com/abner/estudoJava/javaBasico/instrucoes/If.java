package com.abner.estudoJava.javaBasico.instrucoes;

import java.util.Scanner;
public class If {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma temperatura");
        int temperatura = input.nextInt();

        if (temperatura < 20) {
            System.out.println("Frio");

        } else if (temperatura >= 20 && temperatura <= 25) {
            System.out.println("Agradavel");

        } else {
            System.out.println("Calor");
        }


    }
}
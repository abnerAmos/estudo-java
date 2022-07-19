package com.abner.estudoJava.javaBasico.instrucoes;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tipo de conta:");
        String tipoConta = input.next();

        switch (tipoConta) {

            case "poupanca":
                System.out.println("Conta Poupança");
                break;
            case "corrente":
                System.out.println("Conta Corrente");
                break;
            case "investimento":
                System.out.println("Conta de Investimentos");
                break;
            default:
                System.out.println("Tipo de conta não existente");
        }
    }
}
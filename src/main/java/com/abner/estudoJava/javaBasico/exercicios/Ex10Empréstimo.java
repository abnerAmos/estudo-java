package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex10Empréstimo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o faturamento Anual:");

        double faturamentoAnual = input.nextDouble();
        double mediaMensal = faturamentoAnual / 12;

        if (mediaMensal < 2000) {
            System.out.println("Não Aprovado");
        } else if (mediaMensal >= 2000 && mediaMensal < 10000) {
            double concedido = (faturamentoAnual * 20) / 100;
            System.out.println("Valor concedido: " + concedido);
        } else if (mediaMensal >= 10000 && mediaMensal < 20000) {
            double concedido = (faturamentoAnual * 30) / 100;
            System.out.println("Valor concedido: " + concedido);
        } else {
            double concedido = (faturamentoAnual * 40) / 100;
            System.out.println("Valor concedido: " + concedido);
        }
    }
}
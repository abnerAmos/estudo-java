package com.abner.estudoJava.javaBasico.exerciciosNivel2;

import java.util.Scanner;
public class Ex4Quilowatts {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do salario minimo: ");
        double salarioMinimo = input.nextDouble();
        double kw = salarioMinimo / 5;
        double valorKwh = kw / 1000;

        double faturaMensal = (valorKwh * 24) * 30;
        double descontoFatura = (faturaMensal * 15) / 100;

        double faturaDescontada = faturaMensal - descontoFatura;

        System.out.println("Custo quilowatts hora: " + valorKwh);
        System.out.println("Custo fatura mensal: " + faturaMensal);
        System.out.println("Desconto por antecipação: " + descontoFatura);
        System.out.println("Valor pago com desconto: " + faturaDescontada);

    }
}

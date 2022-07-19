package com.abner.estudoJava.javaBasico.exerciciosNivel2;

import java.util.Scanner;
public class Ex5VendaVeiculo {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe o valor da fábrica:");
    double precoFabrica = input.nextDouble();

    System.out.println("Informe a porcentagem do imposto de fábrica:");
    double impostoFabrica = input.nextDouble();
    double calculoImposto = (precoFabrica * impostoFabrica) / 100;

    double totalFabrica = precoFabrica + calculoImposto;

    System.out.println("Informe a porcentagem de lucro revenda:");
    double lucroRevenda = input.nextDouble();
    double calculoRevenda = (totalFabrica * lucroRevenda) / 100;

    double totalVeiculo = totalFabrica + calculoRevenda;

    System.out.println("Lucro Distribuidor: " + calculoRevenda);
    System.out.println("Impostos: " + calculoImposto);
    System.out.println("Total do veículo: " + totalVeiculo);




    }
}

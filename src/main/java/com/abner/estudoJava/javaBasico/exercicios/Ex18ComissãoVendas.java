package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex18ComissãoVendas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o Salário: ");
        double salario = input.nextDouble();

        System.out.println("Informe o Valor das Vendas: ");
        double valorVendas = input.nextDouble();

        double porcentagemFixa = 45;

        if (valorVendas <= 1500) {
            double comissao = (valorVendas * 3) / 100;
            double total = (salario + comissao);
            System.out.println("Seu pagamento é: " + total);

        } else if (valorVendas > 1500) {
            double sobra = valorVendas - 1500;
            double salarioComissao = salario + porcentagemFixa;
            double comissao2 = (sobra * 5) / 100;
            double total = salarioComissao + comissao2;
            System.out.println("Seu pagamento é: " + total);
        }
    }


}
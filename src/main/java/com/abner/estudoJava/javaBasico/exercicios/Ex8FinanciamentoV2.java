package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex8FinanciamentoV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o Salário:");
        double salario = input.nextDouble();

        System.out.println("Parcela Desejada:");
        double valorParcela = input.nextDouble();

        double porcentagem = (salario * 30) / 100;

        String aprovacao = (porcentagem >= valorParcela) ? "Financiamento Aprovado" : "Não Aprovado";
        System.out.println(aprovacao);
        }
    }

package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex15Dolar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos dolar deseja comprar?");
        double dolar = input.nextDouble();
        double reais = dolar * 4.93;
        double iof = reais * 0.35 / 100;
        double spread = 5;
        double total = reais + iof + spread;

        System.out.println(total);

    }
}
package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex12CombustivelEcon {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor da gasolina:");
        double litroGasolina = input.nextDouble();

        System.out.println("Informe o valor do alcool:");
        double litroAlcool = input.nextDouble();

        double kmAlcool = 9;
        double kmGasolina = kmAlcool + (kmAlcool * 30) / 100;

        double rendimentoAlcool = litroAlcool / kmAlcool;
        double rendimentoGasolina = litroGasolina / kmGasolina;



        if (rendimentoAlcool < rendimentoGasolina)
            System.out.println("Combustivel mais economico: Alcool");

        else {
            System.out.println("Combustivel mais economico: Gasolina");
        }

    }
}

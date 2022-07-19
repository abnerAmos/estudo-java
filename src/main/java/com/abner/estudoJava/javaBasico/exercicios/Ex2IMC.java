package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex2IMC {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

		// Dados para cálculo

	System.out.println("Informe o Peso:");
	double peso = input.nextDouble();

	System.out.println("Informe a Altura:");
	double altura = input.nextDouble();

	double imc = peso / (altura * altura);

		System.out.print("IMC: ");
		System.out.println(imc);

	// Algoritmo para cálculo

	if (imc < 18.5) {
		System.out.println("Abaixo do peso normal");

	} else if (imc >= 18.5 && imc < 25) {
		System.out.println("Peso ideal");

	} else if (imc >= 25 && imc < 30) {
		System.out.println("Excesso de peso");

	} else if (imc >= 30 && imc < 35) {
		System.out.println("Obeso Classe I");

	} else if (imc >= 35 && imc < 40) {
		System.out.println("Obeso Classe II");

	} else {
		System.out.println("Obeso Classe III");
	}
	}
}
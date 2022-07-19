package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex17Termometro {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	// Termometro infantil a base de if e else

		System.out.println("Informe a Temperatura:");
		double temperatura = input.nextDouble();

		if (temperatura < 35) {
		System.out.println("Hipotermia");

	}	else if (temperatura >= 35 && temperatura <= 37.3) {
		System.out.println("Estável");

	}	else if (temperatura >= 37.4 && temperatura <= 37.8) {
		System.out.println("Febricula");

	}	else if (temperatura >= 37.9 && temperatura < 39) {
		System.out.println("Febre");

	}	else {
		System.out.println("Febre Alta");
	}
}

	} 
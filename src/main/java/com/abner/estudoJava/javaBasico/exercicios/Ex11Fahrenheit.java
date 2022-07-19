package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex11Fahrenheit {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe Graus Celsius:");
        int celsius = input.nextInt();
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(fahrenheit + ("°F"));

    }
}

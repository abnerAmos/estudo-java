package com.abner.estudoJava.javaBasico.exerciciosNivel2;

import java.util.Scanner;
public class Ex2SalarioProfessor {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Salario Base

        System.out.println("Informe a quantidade de aulas semanais:");
        double aulas = input.nextDouble();
        double semanas = 4.5;
        double aulasSemanais = aulas * semanas;

        System.out.println("Informe o valor da hora paga:");
        double valorHora = input.nextDouble();
        double salarioBase = aulasSemanais * valorHora;

        // Adicional de Horas
        double adicionalHora = (salarioBase * 5) / 100;

        // Descanso Semanal Remunerado
        double dsr = (salarioBase + adicionalHora) / 6;

        // Remuneração Total
        double totalSalarial = salarioBase + adicionalHora + dsr;

        System.out.println("Salário base: " + salarioBase);
        System.out.println("Hora adicinal: " + adicionalHora);
        System.out.println("Descanso remunerado: " + dsr);
        System.out.println("Total pago: " + totalSalarial);
    }
}

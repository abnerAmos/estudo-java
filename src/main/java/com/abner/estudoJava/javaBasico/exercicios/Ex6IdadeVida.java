package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex6IdadeVida {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua data de nascimento (dd/mm/aaaa):");
        String nascimentoUsuario = input.next();

        System.out.println("Informe a data atual (dd/mm/aaaa):");
        String dataAtual = input.next();

        String[] dataNascimento = nascimentoUsuario.split("/");
        int diaNasc = Integer.parseInt(dataNascimento[0]);
        int mesNasc = Integer.parseInt(dataNascimento[1]);
        int anoNasc = Integer.parseInt(dataNascimento[2]);

        String[] data = dataAtual.split("/");
        int diaAtual = Integer.parseInt(data[0]);
        int mesAtual = Integer.parseInt(data[1]);
        int anoAtual = Integer.parseInt(data[2]);

        // Calculo para Idade Atual

        int idade = anoAtual - anoNasc;
        if ((mesAtual < mesNasc) || (mesAtual <= mesNasc && diaAtual < diaNasc)) {
            idade--;
        }
        System.out.println("Você tem " + idade + " anos");

    }
}
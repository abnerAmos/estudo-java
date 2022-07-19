package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex20PalavrasProibidas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um texto: ");
        String texto = input.nextLine().toLowerCase();

        if (texto.contains("telefone") || texto.contains("whats") || texto.contains("contato") || texto.contains("email") || texto.contains("celular")) {
        System.out.println("Proibido informar contato!");
    }
    }
}

package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;

public class Ex20PalavrasProibidasV2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um texto: ");
        String texto = input.nextLine().toLowerCase();

        String proibir = "Proibido informar contato";
        String[] palavras = {"telefone", "whats", "contato", "email", "celular", "contato"};

        for (String tipoContato : palavras)
            if (texto.contains(tipoContato)) {
            System.out.println(proibir);
        }


    }
}

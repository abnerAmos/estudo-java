package com.abner.estudoJava.javaBasico.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex20PalavrasProibidasV3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um texto:");
        String texto = input.nextLine().toLowerCase();

        String proibir = "Proibido informar contato";
        List<String> palavras = new ArrayList<>();
        palavras.add("telefone");
        palavras.add("whats");
        palavras.add("contato");
        palavras.add("email");
        palavras.add("celular");
        palavras.add("contato");

        for (String tipoContato : palavras)
            if (texto.contains(tipoContato)) {
                System.out.println(proibir);
            }


    }
}

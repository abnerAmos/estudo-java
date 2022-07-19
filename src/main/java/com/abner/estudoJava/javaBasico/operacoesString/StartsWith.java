package com.abner.estudoJava.javaBasico.operacoesString;

public class StartsWith {

    public static void main(String[] args) {

        // Verifica se determinado texto começa com determinada palavra

        String texto = "Aulas de Programacao";

        if (texto.startsWith("Au"))
            System.out.println("sim");

        if (texto.endsWith("cao"))          // Verifica se determinado texto termina com determinada palavra
            System.out.println("sim");

        else {
            System.out.println("não");
        }
    }
}
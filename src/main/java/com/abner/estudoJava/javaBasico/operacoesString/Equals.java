package com.abner.estudoJava.javaBasico.operacoesString;

public class Equals {

    public static void main(String[] args) {

        // Verifica se uma palavra é  igual a outra

        String texto = "Aula de Programacao";
        String texto2 = "Aula de Logica";

        boolean verificar = texto.equals("Aula de Logica");
        System.out.println(verificar);

        boolean verificar2 = texto.equals("Aula de Programacao");
        System.out.println(verificar2);

        // Verifica ignorando maiusculas e minusculas

        boolean verificar3 = texto.equalsIgnoreCase("AULA DE PROGRAMACAO");
        System.out.println(verificar3);

        // transformando em maiscula ou minuscula antes da verificação

        boolean verificar4 = texto.toUpperCase().equals("AULA DE PROGRAMACAO");
        System.out.println(verificar4);

        // Pergunta invertida (Negação)

        boolean verificar5 = !texto.equals(texto2);
        System.out.println(verificar5);
    }
}

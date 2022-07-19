package com.abner.estudoJava.javaBasico.operacoesString;

public class Replace {

    public static void main(String[] args) {

        // Substitui uma palavra por outra
        // A diferenciação de Maiusculas e Minusculas

        String texto = "Aula de Programacao";
        System.out.println(texto);

        texto = texto.replace("Programacao", "Logica");
        System.out.println(texto);

        texto = texto.replaceAll("a", "@");         // replaceall substitui todas as palavras informadas
        System.out.println(texto);
    }
}
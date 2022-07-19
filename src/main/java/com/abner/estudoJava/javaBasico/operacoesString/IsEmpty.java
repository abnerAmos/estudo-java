package com.abner.estudoJava.javaBasico.operacoesString;

public class IsEmpty {

    public static void main(String[] args) {

        // Verifica se um texto esta vazio
        // é possivel inverver com ! (Negação)

        String texto = "";
        String texto2 = "Aula de Programacao";

        boolean verificar = texto.isEmpty();
        System.out.println(verificar);

        boolean verificar2 = texto2.isEmpty();
        System.out.println(verificar2);
    }
}
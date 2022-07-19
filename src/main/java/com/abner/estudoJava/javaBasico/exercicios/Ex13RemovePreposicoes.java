package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Locale;
import java.util.Scanner;
public class Ex13RemovePreposicoes {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira um texto com preposições:");
    String texto = input.nextLine().toLowerCase();   // <--- Necessaŕio acrescentar para captar "espaços" no terminal.

    if (texto.contains(" de ")) {
        texto = texto.replaceAll(" de ", " ");

    } if (texto.contains(" da ")) {
        texto = texto.replaceAll(" da ", " ");

    } if (texto.contains(" do ")) {
        texto = texto.replaceAll(" do ", " ");

    } if (texto.contains(" das ")) {
        texto = texto.replaceAll(" das ", " ");

    } if (texto.contains(" dos ")) {
        texto = texto.replaceAll(" dos ", " ");

        } System.out.println(texto);


    }
}

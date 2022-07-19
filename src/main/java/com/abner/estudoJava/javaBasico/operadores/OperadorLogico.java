package com.abner.estudoJava.javaBasico.operadores;

public class OperadorLogico {

    public static void main(String[] args) {

        // && (e)      || (ou)
        boolean teste = (10 < 20 && 20 > 10) || (30 > 10 && 50 < 100);
        System.out.println("Isso é: " + teste);

        // Negacao !

        boolean teste2 = !((10 < 20 && 20 > 10) || (30 > 10 && 50 < 100));
        System.out.println("Isso é: " + teste2);
    }
}
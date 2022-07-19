package com.abner.estudoJava.javaBasico.operadores;

public class OperadoresComparacao {

    public static void main(String[] args) {

        // > maior
        boolean teste1 = 10 > 50;
        boolean teste2 = 10 > 5;

        // < menor
        boolean teste3 = 20 < 70;
        boolean teste4 = 20 < 7;

        // == igual
        boolean teste5 = 30 == 30;
        boolean teste6 = 30 == 40;

        // >= maior ou igual
        boolean teste7 = 40 >= 41;
        boolean teste8 = 40 >= 39;

        // <= menor ou igual
        boolean teste9 = 50 <= 51;
        boolean teste10 = 50 <= 49;

        // != diferente
        boolean teste11 = 60 != 60;
        boolean teste12 = 60 != 100;

        System.out.println(teste1);
        System.out.println(teste2);
        System.out.println(teste3);
        System.out.println(teste4);
        System.out.println(teste5);
        System.out.println(teste6);
        System.out.println(teste7);
        System.out.println(teste8);
        System.out.println(teste9);
        System.out.println(teste10);
        System.out.println(teste11);
        System.out.println(teste12);
    }
}
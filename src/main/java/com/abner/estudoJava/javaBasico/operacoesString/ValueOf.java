package com.abner.estudoJava.javaBasico.operacoesString;

public class ValueOf {

    public static void main(String[] args) {

        // Converte numero em texto(String)

        int numero1 = 10;
        double numero2 = 10.50;

        String sn1 = String.valueOf(numero1);
        String sn2 = String.valueOf(numero2);

        System.out.println(sn1 + 10);
        System.out.println(sn2 + 10);
    }
}
package com.abner.estudoJava.javaBasico.operacoesString;

public class Parse {

    public static void main(String[] args) {

        // Conversão Numero para Texto
        // Int e Double

        String numeroTexto = "10.50";
        String numeroTexto2 = "100";

        double numero = Double.parseDouble(numeroTexto);
        int numero2 = Integer.parseInt(numeroTexto2);

        System.out.println(numeroTexto + 100);
        System.out.println(numero + 100);
        System.out.println();
        System.out.println(numeroTexto2 + 1000);
        System.out.println(numero2 + 1000);
    }
}
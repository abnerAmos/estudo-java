package com.abner.estudoJava.javaBasico.metodosIntro;

public class SobrecargaMetodos {

    // podemos declarar metodos com o mesmo nome, basta diferenciar pelo tipo e/ou quantidade de parametros

    public static void main(String[] args) {

        soma(1,2,3);
        soma(1,2);
    }

    static void soma(int a, int b) {
        System.out.println(a + b);
    }
    // static void soma(int a, int b)

    static void soma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

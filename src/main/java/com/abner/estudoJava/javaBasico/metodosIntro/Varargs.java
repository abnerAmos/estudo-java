package com.abner.estudoJava.javaBasico.metodosIntro;

public class Varargs {

    public static void main(String[] args) {

        // Varargs é possivel inserir "infinitos" argumentos (parâmetros) dentro de um método e transforma-lo em Array

        somar(10,20,30,40,50);
        somar2(40,50, 10,50);
    }
    static void somar(int... numeros) {
        int soma = 0;

        for (int s : numeros)
            soma += s;

        System.out.println(soma);
    }

    // Para inserir argumentos excessivos ao Varargs é necessário inseri-los antes para a JVM identifica-los

    static void somar2(int a, int b, int... numeros) {
        int soma = 0;

        for (int s : numeros)
            soma += s;

        System.out.println(soma);
        System.out.println(a + b);
        System.out.println(a + b + soma);
    }
}
package com.abner.estudoJava.javaBasico.intro;

public class TiposPrimitivos {

    public static void main(String[] args) {

        int idade = 29;				// valor sem fração
        double preco = 19.50;		// valor fracionado
        char letra = 'A';			// apenas 1 caracter
        boolean afirmacao = true;	// verdadeiro ou falso

        byte b = 127;				// valor maximo 127 (sem fracao)
        short s = 32767;				// valor maximo 32 mil (sem fracao)
        int i = 2000000000;			// valor maximo 2 Bi (sem fracao)
        long l = 90000000000000000l;			// 9 quintilhoes (sem fracao, utiliza l no fim)

        float f = 1.797693134f;		// suporta valor fracionado (utiliza f no fim)

        System.out.println(idade);
        System.out.println(preco);
        System.out.println(letra);
        System.out.println(afirmacao);

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
    }
}
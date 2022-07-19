package com.abner.estudoJava.javaBasico.intro;

public class ArrayInt {

    public static void main(String[] args) {

        int[] numPares = new int[10];

        int extensaoLista = numPares.length;

        numPares[0] = 2;
        numPares[1] = 4;
        numPares[2] = 6;
        numPares[3] = 8;
        numPares[4] = 10;
        numPares[5] = 12;
        numPares[6] = 14;
        numPares[7] = 16;
        numPares[8] = 18;
        numPares[9] = 20;

        int numero1 = numPares[0];
        int numero2 = numPares[1];
        int numero3 = numPares[2];
        int numero4 = numPares[3];
        int numero5 = numPares[4];
        int numero6 = numPares[5];
        int numero7 = numPares[6];
        int numero8 = numPares[7];
        int numero9 = numPares[8];
        int numero10 = numPares[9];

        System.out.println(extensaoLista);
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);
        System.out.println(numero7);
        System.out.println(numero8);
        System.out.println(numero9);
        System.out.println(numero10);
    }
}
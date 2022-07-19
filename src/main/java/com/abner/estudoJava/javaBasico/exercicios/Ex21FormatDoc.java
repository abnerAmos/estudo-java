package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex21FormatDoc {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe seu documento (sem pontos e traços): ");
    String numero = input.next();

    if (numero.contains(".") || numero.contains("-") || numero.contains("/")) {
        System.out.println("Documento inválido ou já formatado");

    } else {
        System.out.println("Informe o tipo do documento: ");
        String documento = input.next().toUpperCase();

        switch (documento) {
            case "RG":
                numero = numero.substring(0, 2) + "." + numero.substring(2, 5) + "." + numero.substring(5, 8) + "-" + numero.substring(8);
                System.out.println(numero);
                break;
            case "CPF":
                numero = numero.substring(0, 3) + "." + numero.substring(3, 6) + "." + numero.substring(6, 9) + "-" + numero.substring(9);
                System.out.println(numero);
                break;
            case "CNPJ":
                numero = numero.substring(0, 2) + "." + numero.substring(2, 5) + "." + numero.substring(5, 8) + "/" + numero.substring(8, 12) + "-" + numero.substring(12);
                System.out.println(numero);
                break;
            default:
                System.out.println("Documento inválido");
            }
        }

    }
    }

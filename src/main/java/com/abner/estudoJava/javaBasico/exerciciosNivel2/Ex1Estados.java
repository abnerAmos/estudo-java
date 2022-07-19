package com.abner.estudoJava.javaBasico.exerciciosNivel2;

import java.util.Scanner;
public class Ex1Estados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um estado sem acentos:");
        String estadoSimples = input.nextLine();
        String estadoInformado = estadoSimples.toUpperCase();

        switch (estadoInformado) {

            case "ACRE":
                System.out.println("AC");
                break;
            case "ALAGOAS":
                System.out.println("AL");
                break;
            case "AMAPA":
                System.out.println("AP");
                break;
            case "AMAZONAS":
                System.out.println("AM");
                break;
            case "BAHIA":
                System.out.println("BA");
                break;
            case "CEARA":
                System.out.println("CE");
                break;
            case "DISTRITO FEDERAL":
                System.out.println("DF");
                break;
            case "ESPIRITO SANTO":
                System.out.println("ES");
                break;
            case "GOIAS":
                System.out.println("GO");
                break;
            case "MARANHAO":
                System.out.println("MA");
                break;
            case "MATO GROSSO":
                System.out.println("MT");
                break;
            case "MATO GROSSO DO SUL":
                System.out.println("MS");
                break;
            case "MINAS GERAIS":
                System.out.println("MG");
                break;
            case "PARA":
                System.out.println("PA");
                break;
            case "PARAIBA":
                System.out.println("PB");
                break;
            case "PARANA":
                System.out.println("PR");
                break;
            case "PERNAMBUCO":
                System.out.println("PE");
                break;
            case "PIAUI":
                System.out.println("PI");
                break;
            case "RIO DE JANEIRO":
                System.out.println("RJ");
                break;
            case "RIO GRANDE DO NORTE":
                System.out.println("RN");
                break;
            case "RIO GRANDE DO SUL":
                System.out.println("RS");
                break;
            case "RONDONIA":
                System.out.println("RO");
                break;
            case "RORAIMA":
                System.out.println("RR");
                break;
            case "SANTA CATARINA":
                System.out.println("SC");
                break;
            case "SAO PAULO":
                System.out.println("SP");
                break;
            case "SERGIPE":
                System.out.println("SE");
                break;
            case "TOCANTINS":
                System.out.println("TO");
                break;
            default:
                System.out.println("Estado Inválido");

        }
    }
}

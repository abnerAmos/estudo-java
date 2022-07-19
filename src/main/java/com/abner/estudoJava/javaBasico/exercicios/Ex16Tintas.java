package com.abner.estudoJava.javaBasico.exercicios;

import java.util.Scanner;
public class Ex16Tintas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a Área Metros Quadrados a ser pintada:");
        double areaInformada = input.nextDouble();
        double perdas = (areaInformada * 10) / 100;
        double areaPintar = areaInformada + perdas;

        double areaLata = 108;
        double areaGalao = 21.6;
        double areaGalao3Un = 64.8;

        int qntdLata = 0;
        int qntdGalao = 0;

        double valorLata = 80.00;
        double valorGalao = 25.00;

        while (areaPintar > areaGalao3Un) {
            qntdLata++;
            areaPintar -= areaLata;
        }

        while (areaPintar > 0) {
            qntdGalao++;
            areaPintar -= areaGalao;
        }

        double valorTotal = (valorLata * qntdLata) + (valorGalao * qntdGalao);

        System.out.println("Total de Area a Pintar com Perdas: " + (areaInformada + perdas));
        System.out.println("Latas necessárias: " + qntdLata);
        System.out.println("Galoes necessários: " + qntdGalao);
        System.out.println("Valor total: " + valorTotal);


        }



    }


package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV7Interface;

public class CalculadoraTaxas implements Taxas {

    @Override
    public Double taxaTransferencia() {
        return 5.0;
    }

    @Override
    public Double taxaSaque() {
        return 2.0;
    }

}
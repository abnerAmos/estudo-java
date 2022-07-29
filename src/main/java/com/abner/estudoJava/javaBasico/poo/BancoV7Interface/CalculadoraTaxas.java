package com.abner.estudoJava.javaBasico.poo.BancoV7Interface;

public class CalculadoraTaxas implements Taxas {

    @Override
    public Double taxaTransferencia(Double valor) {
        return 5.0;
    }

    @Override
    public Double taxaSaque(Double valor) {
        return 2.0;
    }

}

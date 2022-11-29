package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV5Herança;

public class Cliente extends Conta {

    public Cliente(String cliente, Double saldo, String tipoConta, Genero genero) {
        super(cliente, saldo, tipoConta, genero);
    }
}

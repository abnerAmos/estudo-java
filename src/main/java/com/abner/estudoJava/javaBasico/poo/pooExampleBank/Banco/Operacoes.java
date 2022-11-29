package com.abner.estudoJava.javaBasico.poo.pooExampleBank.Banco;

public class Operacoes {

    // Comportamento (ações, métodos)

        void depositar (ContaBancaria conta, Double valor) {
        conta.saldo = conta.saldo + valor;
        System.out.printf("%s depositou %s \n", conta.nomeCliente, valor);
    }

    void sacar (ContaBancaria conta, Double valor) {
        if (conta.saldo < valor) {
            System.out.printf("%s seu saldo é insuficiente para sacar %s \n", conta.nomeCliente, valor);

        } else {
            conta.saldo = conta.saldo - valor;
            System.out.printf("%s sacou %s \n", conta.nomeCliente, valor);
        }
    }

    void transferir (ContaBancaria contaSaida, ContaBancaria contaEntrada, Double valor) {
        if (contaSaida.saldo < valor) {
            System.out.printf("%s seu saldo é insuficiente para transferir %s \n", contaSaida.nomeCliente, valor);

        } else {
            contaSaida.saldo = contaSaida.saldo - valor;
            contaEntrada.saldo = contaEntrada.saldo + valor;
            System.out.printf("%s transferiu %s \n", contaSaida.nomeCliente, valor);
        }

    }
}

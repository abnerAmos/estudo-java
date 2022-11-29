package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV2;

public class OperacoesBanco {

    // Comportamento (ações, métodos)

    void depositar(ContaBanco conta, Double valor) {
        conta.saldo = conta.saldo + valor;
        System.out.printf("%s depositou %s com sucesso! \n", conta.cliente, valor);
        System.out.printf("%s seu saldo atual é %s \n", conta.cliente, conta.saldo);
    }

    void sacar(ContaBanco conta, Double valor) {
        if (valor > conta.saldo) {
            System.out.printf("%s seu saldo é insuficiente para sacar %s \n", conta.cliente, valor);
        } else {
            conta.saldo = conta.saldo - valor;
            System.out.printf("%s sacou %s \n", conta.cliente, conta.saldo);
            System.out.printf("%s seu saldo atual é %s \n", conta.cliente, conta.saldo);
        }
        }

    void transferir(ContaBanco contaSaque, ContaBanco contaDeposito, Double valor) {
        if (valor > contaSaque.saldo) {
            System.out.printf("%s seu saldo é insuficiente para transferir %s \n", contaSaque.cliente, valor);
        } else {
            contaSaque.saldo = contaSaque.saldo - valor;
            contaDeposito.saldo = contaDeposito.saldo + valor;
            System.out.printf("%s transferiu %s para %s com sucesso! \n", contaSaque.cliente, valor, contaDeposito.cliente);
            System.out.printf("%s seu saldo atual é %s \n", contaSaque.cliente, contaSaque.saldo);
        }
        }

    void saldoAtual(ContaBanco conta) {
        System.out.printf("%s seu saldo atual é %s \n", conta.cliente, conta.saldo);
    }
}



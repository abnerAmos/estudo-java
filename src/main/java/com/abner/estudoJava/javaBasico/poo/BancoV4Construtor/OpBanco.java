package com.abner.estudoJava.javaBasico.poo.BancoV4Construtor;

public class OpBanco {

    void depositar(Conta conta, Double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.printf("%s depositou %s com sucesso! \n", conta.getCliente(), valor);
        System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
    }

    void sacar(Conta conta, Double valor) {
        if (valor > conta.getSaldo()) {
            System.out.printf("%s seu saldo é insuficiente para sacar %s \n", conta.getCliente(), valor);
        } else {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.printf("%s sacou %s \n", conta.getCliente(), conta.getSaldo());
            System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
        }
        }

    void transferir(Conta contaSaque, Conta contaDeposito, Double valor) {
        if (valor > contaSaque.getSaldo()) {
            System.out.printf("%s seu saldo é insuficiente para transferir %s \n", contaSaque.getCliente(), valor);
        } else {
            contaSaque.setSaldo(contaSaque.getSaldo() - valor);
            contaDeposito.setSaldo(contaDeposito.getSaldo() + valor);
            System.out.printf("%s transferiu %s para %s com sucesso! \n", contaSaque.getCliente(), valor, contaDeposito.getCliente());
            System.out.printf("%s seu saldo atual é %s \n", contaSaque.getCliente(), contaSaque.getSaldo());
        }
        }

    void saldoAtual(Conta conta) {
        System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
    }
}



package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV3Modificador;

public class OpBancoMod {

    // Comportamento (ações, métodos)

    void depositar(ContaMod conta, Double valor) {
        Double saldo2 = conta.getSaldo() + valor;
        conta.setSaldo(saldo2);
        System.out.printf("%s depositou %s com sucesso! \n", conta.getCliente(), valor);
        System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
    }

    void sacar(ContaMod conta, Double valor) {
        if (valor > conta.getSaldo()) {
            System.out.printf("%s seu saldo é insuficiente para sacar %s \n", conta.getCliente(), valor);
        } else {
            Double saldo2 = conta.getSaldo() - valor;
            conta.setSaldo(saldo2);
            System.out.printf("%s sacou %s \n", conta.getCliente(), conta.getSaldo());
            System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
        }
        }

    void transferir(ContaMod contaSaque, ContaMod contaDeposito, Double valor) {
        if (valor > contaSaque.getSaldo()) {
            System.out.printf("%s seu saldo é insuficiente para transferir %s \n", contaSaque.getCliente(), valor);
        } else {
            Double saldo1 = contaSaque.getSaldo() - valor;
            contaSaque.setSaldo(saldo1);
            Double saldo2 = contaDeposito.getSaldo() + valor;
            contaDeposito.setSaldo(saldo2);
            System.out.printf("%s transferiu %s para %s com sucesso! \n", contaSaque.getCliente(), valor, contaDeposito.getCliente());
            System.out.printf("%s seu saldo atual é %s \n", contaSaque.getCliente(), contaSaque.getSaldo());
        }
        }

    void saldoAtual(ContaMod conta) {
        System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
    }
}



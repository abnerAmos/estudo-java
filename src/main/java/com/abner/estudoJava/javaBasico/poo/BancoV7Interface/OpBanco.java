package com.abner.estudoJava.javaBasico.poo.BancoV7Interface;

public class OpBanco {

    private Taxas taxas;

    public OpBanco(Taxas taxas) {
        this.taxas = taxas;
    }

    // Comportamento (ações, métodos)

    void depositar(Conta conta, Double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.printf("%s depositou %s com sucesso! \n", conta.getCliente(), valor);
        System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
    }

    void sacar(Conta conta, Double valor) {
        Double valorTx = taxas.taxaSaque(valor);
        Double saqueMaisTx = valorTx + valor;
        if (saqueMaisTx > conta.getSaldo()) {
            System.out.printf("%s seu saldo é insuficiente para sacar %s \n", conta.getCliente(), valor);
        } else {
            conta.setSaldo(conta.getSaldo() - saqueMaisTx);
            System.out.printf("%s sacou %s \n", conta.getCliente(), valor);
            System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
        }
        }

    void transferir(Conta contaSaque, Conta contaDeposito, Double valor) {
        Double valorTx = taxas.taxaTransferencia(valor);
        Double transfMaisTx = valorTx + valor;
        if (valor > contaSaque.getSaldo()) {
            System.out.printf("%s seu saldo é insuficiente para transferir %s \n", contaSaque.getCliente(), valor);
        } else {
            contaSaque.setSaldo(contaSaque.getSaldo() - transfMaisTx);
            contaDeposito.setSaldo(contaDeposito.getSaldo() + valor);
            System.out.printf("%s transferiu %s para %s com sucesso! \n", contaSaque.getCliente(), valor, contaDeposito.getCliente());
            System.out.printf("%s seu saldo atual é %s \n", contaSaque.getCliente(), contaSaque.getSaldo());
        }
        }

    void saldoAtual(Conta conta) {
        System.out.printf("%s seu saldo atual é %s \n", conta.getCliente(), conta.getSaldo());
    }
}



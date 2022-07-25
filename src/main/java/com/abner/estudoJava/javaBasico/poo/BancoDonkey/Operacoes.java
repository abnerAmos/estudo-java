package com.abner.estudoJava.javaBasico.poo.BancoDonkey;

public class Operacoes {

    void verSaldo(ObjetoCliente cliente) {
        System.out.println(cliente.saldo);
    }

    void depositar(ObjetoCliente cliente, int valor) {
        cliente.saldo = cliente.saldo + valor;
    }

    void sacar(ObjetoCliente cliente, int valor) {
        if (valor > cliente.saldo) {
            System.out.println("Saldo Insuficiente!");
        } else {
            cliente.saldo = cliente.saldo - valor;
        }
    }

    void transferir(ObjetoCliente saida, ObjetoCliente entrada, int valor) {
        if (valor > saida.saldo)
            System.out.println("Saldo Insuficiente!");
        else {
            saida.saldo = saida.saldo - valor;
            entrada.saldo = entrada.saldo + valor;
        }
    }
}

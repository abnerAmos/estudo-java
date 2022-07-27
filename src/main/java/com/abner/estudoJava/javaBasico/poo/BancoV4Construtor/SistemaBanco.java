package com.abner.estudoJava.javaBasico.poo.BancoV4Construtor;

public class SistemaBanco {

    public static void main(String[] args) {

        var c1 = new Conta("Abner Amos", 1000.00, "Corrente");
        var c2 = new Conta("Erik Gonzaga", 5000.00, "Poupança");
        var op = new OpBanco();

        op.saldoAtual(c1);
        op.saldoAtual(c2);
        System.out.println("-------------------------------------");
        op.depositar(c1, 4000.00);
        op.sacar(c1, 2500.00);
        op.transferir(c2, c1, 2000.00);
        op.saldoAtual(c1);
        System.out.println("-------------------------------------");
        op.sacar(c1, 10000.00);
        op.transferir(c2, c1, 10000.00);
    }
}

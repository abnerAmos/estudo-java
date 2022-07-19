package com.abner.estudoJava.javaBasico.POO.Banco;

public class SistemaBanco {

    public static void main(String[] args) {

        // Invocando Objeto.

        var operacao = new Operacoes();

        // Cliente 1.

        ContaBancaria c1 = new ContaBancaria();
        c1.nomeCliente = "Abner Amós";
        c1.numero = 165;
        c1.agencia = 1;
        c1.tipo = "Corrente";
        c1.saldo = 1000.00;

        // Visualizar saldo c1.

        c1.imprimirSaldoTela();

        // Cliente 2.

        ContaBancaria c2 = new ContaBancaria();
        c2.nomeCliente = "Edney Ronan";
        c2.numero = 179;
        c2.agencia = 2;
        c2.tipo = "Corrente";
        c2.saldo = 2000.00;

        // Visualizar saldo c2.

        c2.imprimirSaldoTela();
        System.out.println();

        // Depositando.

        operacao.depositar(c1, 2000.00);
        c1.imprimirSaldoTela();
        System.out.println();

        // Sacando.

        operacao.sacar(c1, 500.00);
        c1.imprimirSaldoTela();
        System.out.println();

        // Transferindo.

        operacao.transferir(c1, c2, 1500.00);
        c1.imprimirSaldoTela();
        System.out.println();
        c2.imprimirSaldoTela();
        System.out.println();

        // Saldo Insuficiente.

        operacao.transferir(c1, c2, 1500.00);
        operacao.sacar(c2, 4000.00);

    }
}

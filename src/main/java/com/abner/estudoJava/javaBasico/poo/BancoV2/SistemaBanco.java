package com.abner.estudoJava.javaBasico.poo.BancoV2;

public class SistemaBanco {

    public static void main(String[] args) {

        // Criando Objeto (Fazendo uma Instancia (new)).

        var c1 = new ContaBanco();
        var c2 = new ContaBanco();
        var op = new OperacoesBanco();

        c1.cliente = "Abner Amos";                  // Atribuindo valor as variáveis
        c1.saldo = 1000.00;

        c2.cliente = "Erik Gonzaga";
        c2.saldo = 5000.00;

        // Executando Operações

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

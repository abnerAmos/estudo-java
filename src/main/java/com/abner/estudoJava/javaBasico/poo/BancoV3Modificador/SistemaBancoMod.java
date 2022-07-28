package com.abner.estudoJava.javaBasico.poo.BancoV3Modificador;

public class SistemaBancoMod {

    public static void main(String[] args) {

        // Criando Objeto (Fazendo uma Instancia (new)).

        var c1 = new ContaMod();
        var c2 = new ContaMod();
        var op = new OpBancoMod();

        c1.setCliente("Abner Amos");        // Atribuindo valor
        c1.setSaldo(1000.00);

        c2.setCliente("Erik Gonzaga");      // Atribuindo valor
        c2.setSaldo(5000.00);

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

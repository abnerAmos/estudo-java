package com.abner.estudoJava.javaBasico.poo.BancoV3Modificador;

public class SistemaBancoMod {

    public static void main(String[] args) {

        var c1 = new ContaMod();
        var c2 = new ContaMod();
        var op = new OpBancoMod();

        c1.setCliente("Abner Amos");
        c1.setSaldo(1000.00);

        c2.setCliente("Erik Gonzaga");
        c2.setSaldo(5000.00);

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

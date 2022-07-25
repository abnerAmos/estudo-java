package com.abner.estudoJava.javaBasico.poo.BancoDonkey;

public class Sistema {

    public static void main(String[] args) {

        ObjetoCliente c1 = new ObjetoCliente();
        c1.cliente = "Abner Amos";
        c1.saldo = 100;

        ObjetoCliente c2 = new ObjetoCliente();
        c2.cliente = "Edney Roldão";
        c2.saldo = 1000;

        Operacoes op = new Operacoes();

        op.depositar(c1, 100);
        op.verSaldo(c1);

        op.sacar(c1, 50);
        op.verSaldo(c1);

        op.transferir(c2, c1, 500);
        op.verSaldo(c2);
        op.verSaldo(c1);

        op.sacar(c1, 1000);
        op.transferir(c1, c2, 1000);
    }
}

package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV1;

public class Sistema {

    public static void main(String[] args) {

        // Criando Objeto (Fazendo uma Instancia (new)).

        ObjetoCliente c1 = new ObjetoCliente();
        c1.cliente = "Abner Amos";                   // Atribuindo valor as variáveis
        c1.saldo = 100;

        ObjetoCliente c2 = new ObjetoCliente();
        c2.cliente = "Edney Roldão";                // Atribuindo valor as variáveis
        c2.saldo = 1000;

        Operacoes op = new Operacoes();

        // Executando Operações

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

package com.abner.estudoJava.javaBasico.poo.pooExampleBank.Banco;

public class ContaBancaria {

        // Caracteristicas (variaveis membro da classe, atributos).

        String nomeCliente;
        String tipo;
        Integer numero;
        Integer agencia;
        Double saldo;

        void imprimirSaldoTela() {
            String msgSaldo = String.format("%s seu saldo é %s", nomeCliente, saldo);
            System.out.println(msgSaldo);
        }

}

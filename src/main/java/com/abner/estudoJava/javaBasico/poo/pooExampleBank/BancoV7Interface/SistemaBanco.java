package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV7Interface;

public class SistemaBanco {

    public static void main(String[] args) {

        // Criando Objeto (Fazendo uma Instancia (new)).

        var c1 = new Cliente("Abner Amos", 1000.00, "Corrente", Genero.MASCULINO);
        var c2 = new Cliente("Erik Gonzaga", 5000.00, "Poupança", Genero.MASCULINO);
        Taxas tx = new CalculadoraTaxas();

        var op = new OpBanco(tx);

        Genero genero = Genero.MASCULINO;       // Enum: Inalterável

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
        System.out.println("-------------------------------------");
        System.out.println("Dados Cadastrais do Cliente: \n");
        System.out.println(c1.getCliente() + ", possui conta: " + c1.getTipoConta() + " - Genero: " + genero.name());
        System.out.println(c2.getCliente() + ", possui conta: " + c2.getTipoConta() + " - Genero: " + genero.name());
    }
}

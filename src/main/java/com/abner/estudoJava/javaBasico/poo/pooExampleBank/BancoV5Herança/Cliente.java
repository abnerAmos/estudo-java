package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV5Herança;

public class Cliente extends Conta {

    public Cliente(String cliente, Double saldo, String tipoConta, Genero genero) {
        super(cliente, saldo, tipoConta, genero);
    }

    public double limiteEmprestimo;

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void Emprestimo(double valor) {
        if (valor <= limiteEmprestimo)
            saldo += valor;
    }
}

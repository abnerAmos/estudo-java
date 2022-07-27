package com.abner.estudoJava.javaBasico.poo.BancoV4Construtor;

public class Conta {

    private final String tipoConta;
    private final Integer agencia = 22;
    private String cliente;
    private Double saldo;
    private Genero genero;

    public Conta(String cliente, Double saldo, String tipoConta, Genero genero) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.genero = genero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}

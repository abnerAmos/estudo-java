package com.abner.estudoJava.javaBasico.poo.BancoV7Interface;

public abstract class Conta {

    // Caracteristicas (variaveis membro da classe, atributos).

    private String tipoConta;           // Privando um atributo
    private Integer agencia;
    private String cliente;
    private Double saldo;

    // Criando um construtor, define a forma que será construido.

    public Conta(String cliente, Double saldo, String tipoConta, Genero genero) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    // Get: Encapsulando um atributo
    // Set: Atualiza/Define o valor

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

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia (Integer agencia) {
        this.agencia = agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta (String tipoConta) {
        this.tipoConta = tipoConta;
    }

}

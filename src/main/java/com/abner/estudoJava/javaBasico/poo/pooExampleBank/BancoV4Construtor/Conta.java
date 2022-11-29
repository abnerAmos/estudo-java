package com.abner.estudoJava.javaBasico.poo.pooExampleBank.BancoV4Construtor;

public class Conta {

    // Caracteristicas (variaveis membro da classe, atributos).

    private final String tipoConta;
    private final Integer agencia = 22;     // Final: Bloqueando seu valor, para não ser sobrescrito
    private String cliente;
    private Double saldo;
    private Genero genero;                  // Privando um atributo

    // Criando um construtor, define a forma que será construido.

    public Conta(String cliente, Double saldo, String tipoConta, Genero genero) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.genero = genero;
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

}

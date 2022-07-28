package com.abner.estudoJava.javaBasico.poo.BancoV3Modificador;

public class ContaMod {

    // Caracteristicas (variaveis membro da classe, atributos).

    private String cliente;         // Privando um atributo
    private Double saldo;

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

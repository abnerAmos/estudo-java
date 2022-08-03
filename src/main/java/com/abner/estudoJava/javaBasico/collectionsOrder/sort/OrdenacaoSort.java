package com.abner.estudoJava.javaBasico.collectionsOrder.sort;

public class OrdenacaoSort implements Comparable<OrdenacaoSort> {
    private Integer idade;
    private String nome;
    private String sobrenome;

    public OrdenacaoSort(Integer idade, String nome, String sobrenome) {
        this.idade = idade;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public int compareTo(OrdenacaoSort o) {
        return this.nome.compareTo(o.nome);
    }
}


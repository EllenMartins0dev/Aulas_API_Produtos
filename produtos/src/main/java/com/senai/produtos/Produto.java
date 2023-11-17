package com.senai.produtos;


// os imports vêm das dependências (provavelmente vem do JPA)
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
    public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(nullable = false, length = 100)
        private String nome;
        @Column(nullable = false)
        private  String descricao;
        @Column(nullable = false, length = 50)
        private String categoria;
        @Column(nullable = false)
        private double valor;


        // construtor com atrbutos
    public Produto(String nome, String descricao, String categoria, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
    }


    // construtor vazio
    public Produto() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

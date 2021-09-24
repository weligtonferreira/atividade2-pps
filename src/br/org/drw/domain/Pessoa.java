package br.org.drw.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Pessoa {
	private int id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNasc;
	private Endereco endereco;

	public Pessoa(String nome, String sobrenome, LocalDate dataNasc, Endereco endereco) {
        Random randomizador = new Random();
        int numeroRandomizado = randomizador.nextInt(100);
        this.id = numeroRandomizado;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
	}

    public String nomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public void imprimir() {
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.nomeCompleto());
        if (this.getDataNasc() != null)
            System.out.println("Data de nascimento: " + this.getDataNasc().format(DateTimeFormatter.ISO_DATE));
        if (this.getEndereco() != null)
            this.getEndereco().imprimir();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

package br.org.drw.domain;

import java.time.LocalDate;
import java.util.Random;

public class Profissional extends Pessoa {
	private String cpf;

    public Profissional(String nome, String sobrenome, LocalDate dataNasc, Endereco endereco, String cpf) {
        super(nome, sobrenome, dataNasc, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

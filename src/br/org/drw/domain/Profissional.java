package br.org.drw.domain;

import java.time.LocalDate;
import java.util.Random;

public class Profissional {
	private int id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNasc;
	private Endereco endereco;
	private int cpf;
	
	public Profissional(String nome, String sobrenome, LocalDate dataNasc, Endereco endereco, int cpf) {
        Random randomizador = new Random();
        int numeroRandomizado = randomizador.nextInt(100);
        this.id = numeroRandomizado;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cpf = cpf;
	}
}

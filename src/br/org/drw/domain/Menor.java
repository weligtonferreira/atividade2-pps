package br.org.drw.domain;

import java.time.LocalDate;
import java.util.Random;

public class Menor {
	private int id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNasc;
	private int matricula;
	
	public Menor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNasc = LocalDate.now();
        Random randomizador = new Random();
        int numeroRandomizado = randomizador.nextInt(100);
        this.id = numeroRandomizado;
	}

	public Menor vazio() {
		return new Menor("", "");
	}

	public Menor(String nome, String sobrenome, LocalDate dataNasc, int matricula) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNasc = dataNasc;
        Random randomizador = new Random();
        int numeroRandomizado = randomizador.nextInt(100);
        this.id = numeroRandomizado;
	}
}

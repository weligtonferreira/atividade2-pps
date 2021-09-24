package br.org.drw.domain;

import java.time.LocalDate;
import java.util.Random;

public class Menor extends Pessoa {
	private int matricula;
	private Profissional profissionalResponsavel;

	public Menor(String nome, String sobrenome, LocalDate dataNasc, Endereco endereco) {
		super(nome, sobrenome, dataNasc, endereco);
		Random randomizador = new Random();
		this.matricula = randomizador.nextInt(100);
	}

	public void imprimirMenor() {
		this.imprimir();
		System.out.println("Matrícula: " + this.matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Profissional getProfissionalResponsavel() {
		return profissionalResponsavel;
	}

	public void setProfissionalResponsavel(Profissional profissionalResponsavel) {
		this.profissionalResponsavel = profissionalResponsavel;
	}
}

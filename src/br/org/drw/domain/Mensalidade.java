package br.org.drw.domain;

import java.util.Random;

public class Mensalidade {
	private int id;
	private float valor;
	private Pagamento pagamento;
	/*
	 * Implementar a classe abstrata Pagamento e as sub-classes concretas PagamentoAVista e PagamentoAPrazo
	 */
	private Menor menor;
	private Profissional profissionalResponsavel;
	
	public Mensalidade(float valor, Menor menor, Profissional profissionalResponsavel) {
		Random randomizador = new Random();
	    int numeroRandomizado = randomizador.nextInt(100);
	    this.id = numeroRandomizado;
		this.valor = valor;
		this.menor = menor;
	    this.profissionalResponsavel = profissionalResponsavel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Menor getMenor() {
		return menor;
	}

	public void setMenor(Menor menor) {
		this.menor = menor;
	}

	public Profissional getProfissionalResponsavel() {
		return profissionalResponsavel;
	}

	public void setProfissionalResponsavel(Profissional profissionalResponsavel) {
		this.profissionalResponsavel = profissionalResponsavel;
	}
}

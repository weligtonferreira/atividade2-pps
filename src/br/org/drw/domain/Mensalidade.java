package br.org.drw.domain;

import br.org.drw.domain.visitor.Visitor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class Mensalidade {
	private int id;
	private float valor;
	private Menor menor;
	private Profissional profissionalResponsavel;
	private LocalDate dataPagamento;
	private Pagamento pagamento;

	public Mensalidade(float valor, Menor menor, Profissional profissionalResponsavel) {
		Random randomizador = new Random();
	    int numeroRandomizado = randomizador.nextInt(100);
	    this.id = numeroRandomizado;
		this.valor = valor;
		this.menor = menor;
	    this.profissionalResponsavel = profissionalResponsavel;
	}

	public void pagar(Pagamento pagamento) {
		this.setPagamento(pagamento);
	}

	public void confirmarPagamento(List<Mensalidade> mensalidades){
		this.setDataPagamento(LocalDate.now());
		mensalidades.add(this);
	}

	public void imprimir(Visitor visitor) {
		System.out.println("Id: " + this.getId());
		System.out.println("Valor: " + this.getValor());
		System.out.println("----------------  Pagamento  ----------------");
		this.getPagamento().accept(visitor);
		System.out.println("Data pagamento: " + this.getDataPagamento().toString());
		System.out.println("----------------    Menor    ----------------");
		this.menor.imprimirMenor();
		System.out.println("---------------- Profissional ---------------");
		this.profissionalResponsavel.imprimir();
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

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

}

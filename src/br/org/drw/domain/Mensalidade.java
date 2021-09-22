package br.org.drw.domain;

import java.util.Random;

public class Mensalidade {
	private int id;
	private int valor;
	private TipoPagamento tipo;
	private Profissional profissional;
	
	public Mensalidade(int valor, Profissional profissional) {
		Random randomizador = new Random();
	    int numeroRandomizado = randomizador.nextInt(100);
	    this.id = numeroRandomizado;
	    this.tipo = TipoPagamento.AVISTA;
	    this.profissional = profissional;
	}
	
	enum TipoPagamento {
		AVISTA,
		APRAZO
	}

}

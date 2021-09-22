package br.org.drw.domain;

public class Endereco {
	private String cep;
	private int numero;
	private String rua;
	private String bairro;
	
	public Endereco(String cep, int numero, String rua, String bairro) {
		this.cep = cep;
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
	}
}

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

	public void imprimir() {
		System.out.println("Endereço: " + this.getNumero() + ", " + this.getRua() + ", " + this.getBairro());
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}

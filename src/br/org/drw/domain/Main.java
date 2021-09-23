package br.org.drw.domain;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Endereco endereco = new Endereco(
			"58750450",
			15,
			"Fausto Silva",
			"Centro"
		);

		Profissional profissional = new Profissional(
			"Marcos",
			"Silva",
			LocalDate.of(1998, 5, 8),
			endereco,
			"12345678910"
		);

		Menor menor = new Menor(
			"João",
			"Rocha",
			LocalDate.of(2019, 7, 18),
			endereco,
			201900001
		);
		menor.setProfissionalResponsavel(profissional);

		Creche creche = new Creche("Creche Sorriso Genuíno", 120f);
		creche.setProfissional(profissional);
		creche.setMenor(menor);

		Mensalidade mensalidade = creche.gerarMensalidade(menor);

		mensalidade.confirmarPagamento(creche.getMensalidades());

		creche.imprimirMensalidades();
		
		System.out.println("\nNovo pagamento:");
		Pagamento pagamentoAntes = new PagamentoAVista(120.00);
		pagamentoAntes.imprimirValor();

		System.out.println("\nPagamento gerado com base no anterior:");
		Pagamento pagamentoAgora = pagamentoAntes.clone();
		pagamentoAgora.imprimirValor();
		pagamentoAgora.setValor(110.00);
		pagamentoAgora.imprimirValor();
	}
}

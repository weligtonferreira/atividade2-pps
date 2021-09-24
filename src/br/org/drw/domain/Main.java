package br.org.drw.domain;

import br.org.drw.domain.builder.UsuarioBuilder;
import br.org.drw.domain.builder.UsuarioBuilderException;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws UsuarioBuilderException {
		Endereco endereco = new Endereco(
				"58750450",
				15,
				"Fausto Silva",
				"Centro"
		);

		UsuarioBuilder profissionalBuilder = new UsuarioBuilder();
		profissionalBuilder
			.comCpf("22222222222")
			.comNome("Leo")
			.comSobrenome("Tavares")
			.comDataNasc(LocalDate.of(1995, 8, 18))
			.comEndereco(endereco);
		Profissional novoProfissional = profissionalBuilder.toUsuarioProfissional();

		UsuarioBuilder menorBuilder = new UsuarioBuilder();
		menorBuilder
			.comMatricula(20190001)
			.comNome("Marcio")
			.comSobrenome("Tavares")
			.comDataNasc(LocalDate.of(2018, 4, 27));
		Menor novoMenor = menorBuilder.toUsuarioMenor();
		novoMenor.setProfissionalResponsavel(novoProfissional);

//		Profissional profissional = new Profissional(
//			"Marcos",
//			"Silva",
//			LocalDate.of(1998, 5, 8),
//			endereco,
//			"12345678910"
//		);
//
//		Menor menor = new Menor(
//			"João",
//			"Rocha",
//			LocalDate.of(2019, 7, 18),
//			endereco,
//			201900002
//		);
//		menor.setProfissionalResponsavel(profissional);

//		Creche creche = new Creche("Creche Sorriso Genuíno", 120f);
//		creche.setProfissional(profissional);
//		creche.setMenor(menor);
//
//		Mensalidade mensalidade = creche.gerarMensalidade(menor);
//		mensalidade.pagar(new PagamentoAVista(creche.getValorMensalidade()));
//		mensalidade.confirmarPagamento(creche.getMensalidades());
//
//		creche.imprimirMensalidades();

		// Atribuindo as instâncias do builder
		Creche creche = new Creche("Creche Sorriso Genuíno", 120f);
		creche.setProfissional(novoProfissional);
		creche.setMenor(novoMenor);

		Mensalidade novaMensalidade = creche.gerarMensalidade(novoMenor);
		novaMensalidade.pagar(new PagamentoAVista(creche.getValorMensalidade()));
		novaMensalidade.confirmarPagamento(creche.getMensalidades());

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

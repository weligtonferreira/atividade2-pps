package br.org.drw.domain;

import br.org.drw.domain.visitor.Visitor;

public class PagamentoAPrazo extends Pagamento {
    private String numCartao;

    public PagamentoAPrazo(double valor, String numCartao) {
        super(valor);
        this.numCartao = numCartao;
    }

    public PagamentoAPrazo(PagamentoAPrazo pagamentoAPrazo) {
    	super(pagamentoAPrazo.getValor());
	}

	@Override
    public void imprimir() {
        this.imprimirValor();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.imprimirPagamento(this);
    }

    @Override
	public Pagamento clone() {
		return new PagamentoAPrazo(this);
	}
}

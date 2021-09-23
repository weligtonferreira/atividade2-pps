package br.org.drw.domain;

import br.org.drw.domain.visitor.Visitor;

public class PagamentoAVista extends Pagamento {

    public PagamentoAVista(double valor) {
        super(valor);
    }

    public PagamentoAVista(PagamentoAVista pagamentoAVista) {
    	super(pagamentoAVista.getValor());
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
		return new PagamentoAVista(this);
	}
}

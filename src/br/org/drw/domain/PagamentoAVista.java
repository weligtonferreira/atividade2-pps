package br.org.drw.domain;

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
	public Pagamento clone() {
		return new PagamentoAVista(this);
	}
}

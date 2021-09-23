package br.org.drw.domain;

public class PagamentoAVista extends Pagamento {

    public PagamentoAVista(double valor) {
        super(valor);
    }

    @Override
    public void imprimir() {
        this.imprimirValor();
    }
}

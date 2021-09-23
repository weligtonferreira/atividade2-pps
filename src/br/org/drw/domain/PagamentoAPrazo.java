package br.org.drw.domain;

public class PagamentoAPrazo extends Pagamento {
    private String numCartao;

    public PagamentoAPrazo(double valor, String numCartao) {
        super(valor);
        this.numCartao = numCartao;
    }

    @Override
    public void imprimir() {
        this.imprimirValor();
    }
}

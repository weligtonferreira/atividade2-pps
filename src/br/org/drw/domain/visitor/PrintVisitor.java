package br.org.drw.domain.visitor;

import br.org.drw.domain.PagamentoAPrazo;
import br.org.drw.domain.PagamentoAVista;

public class PrintVisitor implements Visitor {

    @Override
    public void imprimirPagamento(PagamentoAVista pagamento) {
        System.out.println("Método de pagamento: Dinheiro");
        pagamento.imprimirValor();
    }

    @Override
    public void imprimirPagamento(PagamentoAPrazo pagamento) {
        System.out.println("Método de pagamento: Cartão");
        pagamento.imprimirValor();
    }
}

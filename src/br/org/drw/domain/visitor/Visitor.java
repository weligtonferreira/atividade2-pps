package br.org.drw.domain.visitor;

import br.org.drw.domain.PagamentoAPrazo;
import br.org.drw.domain.PagamentoAVista;

public interface Visitor {
    public void imprimirPagamento(PagamentoAVista pagamento);
    public void imprimirPagamento(PagamentoAPrazo pagamento);
}

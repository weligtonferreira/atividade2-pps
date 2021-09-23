package br.org.drw.domain;

import br.org.drw.domain.visitor.Visitor;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public final void imprimirValor() {
        System.out.println("Valor: " + this.getValor());
    };

    public abstract void imprimir();

    public abstract void accept(Visitor visitor);

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract Pagamento clone();
}

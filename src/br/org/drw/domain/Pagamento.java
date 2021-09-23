package br.org.drw.domain;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public final void imprimirValor() {
        System.out.println("O valor é: " + this.getValor());
    };

    public abstract void imprimir();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract Pagamento clone();
}

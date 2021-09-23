package br.org.drw.domain;

import java.util.ArrayList;
import java.util.List;
import br.org.drw.domain.visitor.*;

public class Creche {
    private String nome;
    private List<Menor> menores;
    private List<Profissional> profissionais;
    private List<Mensalidade> mensalidades;
    private float valorMensalidade;

    public Creche (String nome, float valorMensalidade) {
        this.nome = nome;
        this.menores = new ArrayList<>();
        this.profissionais = new ArrayList<>();
        this.mensalidades = new ArrayList<>();
        this.valorMensalidade = valorMensalidade;
    }

    public Mensalidade gerarMensalidade(Menor menor) {
        return new Mensalidade(this.valorMensalidade, menor, menor.getProfissionalResponsavel());
    }

    public void imprimirMensalidades() {
        Visitor visitor = new PrintVisitor();

        for(Mensalidade mensalidade: this.mensalidades) {
            System.out.println("<<-------------- Mensalidade --------------->>");
            mensalidade.imprimir(visitor);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Menor> getMenores() {
        return menores;
    }

    public void setMenor(Menor menor) {
        this.menores.add(menor);
    }

    public void setMenores(List<Menor> menores) {
        this.menores = menores;
    }

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissional(Profissional profissional) {
        this.profissionais.add(profissional);
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }

    public List<Mensalidade> getMensalidades() {
        return mensalidades;
    }

    public void setMensalidades(List<Mensalidade> mensalidades) {
        this.mensalidades = mensalidades;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}

package br.org.drw.domain.builder;

import br.org.drw.domain.Endereco;
import br.org.drw.domain.Menor;
import br.org.drw.domain.Profissional;

import java.time.LocalDate;

public class UsuarioBuilder {
    private int id;
    private String cpf;
    private int matricula;
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Endereco endereco;

    public UsuarioBuilder() {
    }

    public UsuarioBuilder comCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public UsuarioBuilder comMatricula(int matricula) {
        this.matricula = matricula;
        return this;
    }

    public UsuarioBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder comSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public UsuarioBuilder comDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    public UsuarioBuilder comEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public Menor toUsuarioMenor() throws UsuarioBuilderException {
        validarUsuarioComMatricula();
        return new Menor(nome, sobrenome, dataNasc, endereco);
    }

    public Profissional toUsuarioProfissional() throws UsuarioBuilderException {
        validarUsuarioComCpf();
        return new Profissional(nome, sobrenome, dataNasc, endereco, cpf);
    }

    private void validarUsuarioComCpf() throws UsuarioBuilderException {
        if(nome == null || nome.isEmpty())
            throw new UsuarioBuilderException("Nome inválido!");
        if(sobrenome == null || sobrenome.isEmpty())
            throw new UsuarioBuilderException("Sobrenome inválido!");
        if(cpf == null || cpf.isEmpty())
            throw new UsuarioBuilderException("CPF inválido!");
    }

    private void validarUsuarioComMatricula() throws UsuarioBuilderException {
        if(nome == null || nome.isEmpty())
            throw new UsuarioBuilderException("Nome inválido!");
        if(sobrenome == null || sobrenome.isEmpty())
            throw new UsuarioBuilderException("Sobrenome inválido!");
        if(matricula <= 0)
            throw new UsuarioBuilderException("Matrícula inválida!");
    }
}

package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // entidade: classe que tenha algum atributo que identifique o objeto nesse caso o br.com.alura.escola.aluno.CPF;

    private CPF cpf;
    private String nome;

    private Email email; // Criar uma classe br.com.alura.escola.aluno.Email no lugar de String e deixa todas as validacoes nela

    private List<Telefone> telefones = new ArrayList<>(); //regra de negocio dentro de aluno pois o telefone é do aluno

    private String senha;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }


    public String getCpf() {
        return cpf.getNumero();
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }


}

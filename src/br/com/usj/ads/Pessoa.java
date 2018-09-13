package br.com.usj.ads;

import java.util.Objects;

public class Pessoa {

    private int idade;
    private String nome;

    public Pessoa(String nome, int idade) {
        if (nome == null) {
            throw new UnsupportedOperationException("Nome não pode ser vazio (nulo)");
        }

        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return getIdade() == pessoa.getIdade() &&
                Objects.equals(getNome(), pessoa.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdade(), getNome());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}

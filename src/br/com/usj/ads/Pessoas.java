package br.com.usj.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoas {

    private List<Pessoa> pessoas;

    public Pessoas() {
        pessoas = new ArrayList<>();
    }

    public boolean adiciona(Pessoa pessoa) {
        return pessoas.add(pessoa);
    }

    public boolean remove(Pessoa pessoa) {
        return pessoas.remove(pessoa);
    }

    public int indexOf(Pessoa pessoa) {
        return pessoas.indexOf(pessoa);
    }

    public void limpar() {
        pessoas.clear();
    }

    public Pessoa buscaPorNome(String nome) {
        return pessoas
                .stream()
                .filter(
                        pessoa -> pessoa.getNome().equalsIgnoreCase(nome)
                )
                .findFirst()
                .orElse(null);
    }

    public Pessoa buscaIdade(int idade) {
        return pessoas
                .stream()
                .filter(
                        pessoa -> pessoa.getIdade() == idade
                )
                .findFirst()
                .get();
    }
}

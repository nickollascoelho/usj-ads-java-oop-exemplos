package br.com.usj.ads;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    private final Pessoas pessoas;

    public Main() {
        pessoas = new Pessoas();

        pessoas.adiciona(new Pessoa("João", 18));
        pessoas.adiciona(new Pessoa("Pedro", 20));
        pessoas.adiciona(new Pessoa("Maria", 25));

        System.out.println(pessoas.buscaPorNome("João").getIdade()); // idade do João

        System.out.println(pessoas.buscaPorNome("José")); // não existe (nulo)

        System.out.println(pessoas.buscaIdade(25).toString()); // Maria

        pessoas.limpar();

        System.out.println(pessoas.buscaPorNome("João")); // nulo
    }
}

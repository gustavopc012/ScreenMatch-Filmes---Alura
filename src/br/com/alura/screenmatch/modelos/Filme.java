package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String noWayHome) {
        super();
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" +  this.getAnoDeLancamento() + ")";
    }
}

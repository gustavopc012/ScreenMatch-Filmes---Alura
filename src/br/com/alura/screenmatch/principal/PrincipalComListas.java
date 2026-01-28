package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Doomsday", 2026);
        outroFilme.avalia(9);
        var filmedoGustavo = new Filme("No Way Home", 2021);
        filmedoGustavo.avalia(10);
        Serie twd = new Serie("The Walking Dead", 2010);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmedoGustavo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(twd);
        for (Titulo item: lista){
            System.out.println(item);
            Filme filme = (Filme) item;
            System.out.println("Classificação" + filme.getClassificao();
            
        }
    }
}


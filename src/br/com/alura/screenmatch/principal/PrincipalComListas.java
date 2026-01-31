package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Doomsday", 2026);
        outroFilme.avalia(9);
        var filmedoGustavo = new Filme("No Way Home", 2021);
        filmedoGustavo.avalia(10);
        Serie twd = new Serie("The Walking Dead", 2010);

        Filme f1 = filmedoGustavo;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmedoGustavo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(twd);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificao() > 2) {
                System.out.println("Classificação " + filme.getClassificao());
            }

            
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Wagner Moura");
        buscaPorArtista.add("Fernanda Torres");
        buscaPorArtista.add("Harrison Ford");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano ");
        System.out.println(lista);
    }
}








import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie twd = new Serie();
        twd.setNome("The Walking Dead");
        twd.setAnoDeLancamento(2010);
        twd.exibeFichaTecnica();
        twd.setTemporadas(15);
        twd.setMinutosPorEpisodio(40);
        twd.setEpisodiosPorTemporada(16);
        System.out.println("Duração da série : " + twd.getDuracaoEmMinutos());

       Filme outroFilme = new Filme("Doomsday");
        outroFilme.setAnoDeLancamento(2026);
        outroFilme.setDuracaoEmMinutos(180);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(twd);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(twd);
        episodio.setTotalVisualizacoes(400);
        filtro.filtra(episodio);

         var filmedoGustavo = new Filme("No Way Home");
        filmedoGustavo.setDuracaoEmMinutos(148);
        //filmedoGustavo.setNome("No Way Home");
        filmedoGustavo.setAnoDeLancamento(2021);
        filmedoGustavo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmedoGustavo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do  filme " + listaDeFilmes.get(0).toString());



    }
}

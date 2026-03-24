package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoFelpao = new Filme("DogVille", 2003);
        filmeDoFelpao.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoFelpao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação: " + filme.getClassificacao());

        }
    }
}

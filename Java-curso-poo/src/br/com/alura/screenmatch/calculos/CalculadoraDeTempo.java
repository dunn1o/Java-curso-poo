package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

       public int getTempoTotal() {
         return tempoTotal;
    }

    // public void inclui(Filme f) {
    //     tempoTotal += f.getDuracaoEmMinutos();
    // }
    
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos de" + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}

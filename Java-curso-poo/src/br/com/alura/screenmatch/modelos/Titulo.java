package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }
    
    public int getTotalDeaAvaliacoes(){
        return totalDeAvaliacoes;
    }

   public void setNome(String nome) {
        this.nome = nome;
    }

   public int getAnoDeLancamento() {
    return anoDeLancamento;
}

   public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
   }

   public boolean isIncluindoNoPlano() {
    return incluindoNoPlano;
   }

   public void setIncluindoNoPlano(boolean incluindoNoPlano) {
    this.incluindoNoPlano = incluindoNoPlano;
   }

   public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
   }

   public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
   }

   public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento); 
    }
        
   public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

   public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

   @Override
   public int compareTo(Titulo outroTitulo) {
    return this.getNome().compareTo(outroTitulo.getNome());
   }
}

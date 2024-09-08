package edu.ada.midia;

public abstract class Midia {

    protected String titulo;
    protected String genero;
    protected int anoLancamento;
    protected int avaliacao;//de 1 a 5 estrelas
    protected String paisOrigem;

    public Midia(String titulo, String genero, int anoLancamento, int avaliacao, String paisOrigem) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.paisOrigem = paisOrigem;
    }



    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}

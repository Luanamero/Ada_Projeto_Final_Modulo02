package edu.ada.midia;

public class Jogo extends Midia{

    private String desenvolvedor;
    private String estiloJogo;//soulsLike, plataforma, puzzle...

    public Jogo(String titulo, String genero, int anoLancamento, int avaliacao, String paisOrigem, String dev, String estiloJogo) {
        super(titulo, genero, anoLancamento, avaliacao, paisOrigem);
        this.desenvolvedor = dev;
        this.estiloJogo = estiloJogo;
    }

    public String getEstiloJogo() {
        return estiloJogo;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }
}

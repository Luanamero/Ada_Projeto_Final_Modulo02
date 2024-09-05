package edu.ada.midia;

public class Livro extends Midia{
    private String autor;
    private String idiomaLido;

    public Livro(String titulo, String genero, int anoLancamento, int avaliacao, String paisOrigem, String autor, String idiomaLido) {
        super(titulo, genero, anoLancamento, avaliacao, paisOrigem);
        this.autor = autor;
        this.idiomaLido = idiomaLido;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getIdiomaLido(){
        return this.idiomaLido;
    }


}

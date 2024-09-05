package edu.ada.midia;

public class Filme extends Midia {
    private String diretor;
    private boolean oscar;
    

    public Filme(String titulo, String genero, int anoLancamento, int avaliacao, String diretor, String paisOrigem, boolean oscar) {
        super(titulo, genero, anoLancamento, avaliacao, paisOrigem);
        this.diretor = diretor;
        this.oscar = oscar;
    }


    public String getDiretor(){
        return this.diretor;
    }

    public String getOscar(){
        if(this.oscar == true){
            return "Esse filme já ganhou um oscar";
        }else{
            return "Esse filme nunca ganhou um oscar";
        }
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    
}

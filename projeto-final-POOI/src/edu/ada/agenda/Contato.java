package edu.ada.agenda;

public class Contato {
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    //TODO o atributo que não entendemos corretamente

    public Contato(String nome, String telefone, String email) {
        this.id = 1; //Métodos para dar o id automaticamente
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    public Contato() {}//Manter o construtor padrão?


    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        //Verificar se contem apenas números?
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //Verificar se contem o @email.com?
        this.email = email;
    }
}

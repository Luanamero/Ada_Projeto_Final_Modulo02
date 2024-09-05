package edu.ada.agenda;

import edu.ada.midia.Midia;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private List<Midia> midias;

    public Contato(String nome, String telefone, String email) {
        this.id = 1; //Métodos para dar o id automaticamente
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        midias = new ArrayList<Midia>();
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

    public void addMidia() {
        //TODO faz as solicitações para receber o que precisa pra midia
        Midia midia = null;//TODO usar um jeito para selecionar a midia desejada e adicionar a lista sugestão swich:case e dar um new
        midias.add(midia);
    }
}

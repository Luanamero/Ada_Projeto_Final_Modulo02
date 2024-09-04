package edu.ada.agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public boolean removeContato(Integer id) {
        //TODO implementar
        return false;
    }

    public Contato getContato(Integer id) {
        //TODO implementar
        return new Contato();
    }

    public void getContatos() {
        //TODO implementar a saida dos contatos

    }

    public Contato editarContato(Integer id, Contato contato) {
        //TODO implementar
        return null;
    }


}

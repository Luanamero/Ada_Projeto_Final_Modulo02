package edu.ada.agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Agenda {
    public List<Contato> contatos;

    public  Agenda() {
        contatos = new ArrayList<Contato>();
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public void removeContato(Integer id) {
        if (verificaVazio()) return;
        for (Contato contato : contatos) {
            if (Objects.equals(contato.getId(), id)) {
                contatos.remove(contato);
                System.out.println("Contato removido com sucesso!");
            }
            else
                System.out.println("Contato não localizado");
        }
    }

    public Contato getContato(Integer id) {
        if (verificaVazio()) return null;
        for (Contato contato : contatos) {
            if (Objects.equals(contato.getId(), id)) {
                return contato;
            }
        }
        return null;
    }

    public void getContatos() {
        if (verificaVazio()) return;
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public Contato editarContato(Integer id,
                                 String novoNome,
                                 String novoTelefone,
                                 String novoEmail) {
        if (verificaVazio()) return null;
        for (Contato contato : contatos) {
            if (Objects.equals(contato.getId(), id)) {
                contato.setNome(novoNome);
                contato.setTelefone(novoTelefone);
                contato.setEmail(novoEmail);
                return contato;
            }
        }
        return null;
    }

    public boolean verificaVazio() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia");
            return true;
        }
        return false;
    }

}

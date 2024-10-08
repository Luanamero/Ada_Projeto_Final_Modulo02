package edu.ada.agenda;
import edu.ada.midia.Midia;
import java.util.ArrayList;
import java.util.List;

public class Contato {
    private  static int contador = 0;
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private List<Midia> midias; //inicializar no construtor?

    public Contato(String nome, String telefone, String email, List<Midia> midias) {
        //Métodos para dar o id automaticamente
        this.midias = new ArrayList<>();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.midias =  midias;//Fazer construtor sem midia para ser opcional?
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", midias=" + midias +
                '}';
    }

    public Contato() {
        midias = new ArrayList<>();
        this.id = ++contador;

    }//Manter o construtor padrão?



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public List<Midia> getMidias() {
        return midias;
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

    public void addMidia(Midia midia) {
        if (midias == null) {
            return;
        }
        midias.add(midia);
    }
}

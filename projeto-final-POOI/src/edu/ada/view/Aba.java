package edu.ada.view;

import edu.ada.agenda.Agenda;
import edu.ada.agenda.Contato;
import edu.ada.midia.Midia;
import edu.ada.util.MetodosUteis;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Aba {
    Scanner sc = new Scanner(System.in);

    Integer id = 0;
    public void cadastrar(Agenda agenda){
        Contato contato = new Contato();


        solicitacaoDeEntrada("Digite o nome", MetodosUteis::validaNome, contato::setNome, "Nome" );

        solicitacaoDeEntrada("Digite o telefone", MetodosUteis::validaTelefone,contato::setTelefone, "Telefone" );

        solicitacaoDeEntrada("Digite o Email", MetodosUteis::validaEmail,email->contato.setNome(email), "E-mail" );

        String resposta;
        do {
            System.out.println("Deseja adicionar uma midia S/N?");
            resposta = sc.nextLine().toUpperCase();

            if (resposta.equals("S")) {
                SubAbas subAbas = new SubAbas();
                Midia midia = subAbas.abrirOpcao();
                contato.addMidia(midia);

            }

        }while(resposta.equals("S"));
        agenda.addContato(contato);
    };

    public void listarTodos(Agenda agenda){
        agenda.getContatos();
    };

    public void listar(Agenda agenda){
        if(agenda.verificaVazio())
            return;
        id = verificaId("Digite o id do contato");
        if (id == null) return;

        Contato contato = agenda.getContato(id);
        if (contato != null) {
            System.out.println(contato);
            System.out.println();
        } else {
            System.out.println("Contato com ID " + id + " não encontrado.");
            System.out.println();

        }


    }

    public void editar(Agenda agenda){
        if(agenda.verificaVazio())
            return;


        id = verificaId("Digite o id do contato");
        if (id == null) return;
        Contato contato = agenda.getContato(id);

        if (contato == null) {
            System.out.println("Contato com ID " + id + " não encontrado.");
            System.out.println();
            return;

        }

        String nome = solicitacaoDeEntradaEditar("Digite o novo nome", MetodosUteis::validaNome,  "Nome" );
        String telefone = solicitacaoDeEntradaEditar("Digite o novo telefone", MetodosUteis::validaTelefone, "Telefone" );
        String email = solicitacaoDeEntradaEditar("Digite o novo Email", MetodosUteis::validaEmail, "E-mail" );
        agenda.editarContato(id, nome, telefone, email);
        System.out.println("Contato Atualizado com Sucesso!");

    };

    public void excluir(Agenda agenda){
        if (agenda.verificaVazio())
            return;
        Integer id = verificaId("Digite o Id do contato a ser removido");
        if (id == null) return;
        agenda.removeContato(id);

    }




    private void solicitacaoDeEntrada(String pergunta, Predicate<String> validador, Consumer<String> contato, String tipo ){
        boolean verificador = false;

        do{
            System.out.println(pergunta);
            String entrada = sc.nextLine();
            if(validador.test(entrada)){
                contato.accept(entrada);
                verificador = true;
            }else{
                System.out.println(tipo + " inválido, digite novamente:");
            }
        }while (!verificador);
    }

    private String solicitacaoDeEntradaEditar(String pergunta, Predicate<String> validador, String tipo ){
        boolean verificador = false;
        String entrada;
        do{
            System.out.println(pergunta);
            entrada = sc.nextLine();
            if(validador.test(entrada)){
                verificador = true;
            }else{
                System.out.println( tipo + " inválido, digite novamente:");
            }
        }while (!verificador);
        return entrada ;
    }

    public Integer verificaId(String mensagem) {
        System.out.println(mensagem);
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("Por favor, insira apenas números!");
            System.out.println();
            return null; // Retorna null em caso de erro
        }
    }
}

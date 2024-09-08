package edu.ada.view;

import edu.ada.agenda.Agenda;
import edu.ada.agenda.Contato;
import edu.ada.midia.Midia;

import java.util.Scanner;

public class Aba {
    Scanner sc = new Scanner(System.in);

    public void cadastrar(Agenda agenda){

        int id = agenda.contatos.size();

        Contato contato = new Contato();
        contato.setId(id+1);

        System.out.println("Digite o nome");
        contato.setNome(sc.nextLine());

        System.out.println("Digite o Telefone");
        contato.setTelefone(sc.nextLine());

        System.out.println("Digite o Email");
        contato.setEmail(sc.nextLine());

        System.out.println("Deseja adicionar uma midia S/N?");
        String resposta = sc.nextLine().toUpperCase();

        if(resposta.equals("S")){
        SubAbas subAbas = new SubAbas();
        Midia midia = subAbas.abrirOpcao();
        contato.addMidia(midia);

        }
        agenda.addContato(contato);

            };
    public void listarTodos(Agenda agenda){
        agenda.getContatos();
    };

    public void listar(Agenda agenda){
        if (agenda.verificaVazio()){}else {
        System.out.println("Digite o id do contato");
        int id = sc.nextInt();

            Contato contato = agenda.getContato(id);
            if (contato != null) {
                               System.out.println(contato);
            } else {
                System.out.println("Contato com ID " + id + " não encontrado.");
            }
        }
    }

    public void editar(Agenda agenda){
        if (agenda.verificaVazio()){}else {

            System.out.println("Digite o id do contato");
            System.out.println("Digite o nome do contato");
            System.out.println("Digite o tele do contato");
            System.out.println("Digite o email do contato");
            agenda.editarContato(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
    };

    public void excluir(Agenda agenda){
        if (agenda.verificaVazio()){}else {
        System.out.println("Digite o Id do contato a ser removido");
        int id = sc.nextInt();
        agenda.removeContato(id);
    }}
}

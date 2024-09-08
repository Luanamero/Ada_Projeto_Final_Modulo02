package edu.ada.view;

import edu.ada.agenda.Agenda;
import edu.ada.agenda.Contato;

import java.util.Scanner;

public class Menu {
    private Agenda agenda = new Agenda();
    private Aba aba = new Aba();
    private  Scanner sc = new Scanner(System.in);

    public void abrirMenu() {
        System.out.println("Bem vindo!");
        System.out.println("1. Cadastrar Contato");
        System.out.println("2. Listar todos os Contatos");
        System.out.println("3. Listar um Contato por Id");
        System.out.println("4. Editar Contato");
        System.out.println("5. Excluir Contato");
        System.out.println("0. Sair");
        System.out.println("");

        int opcao =  Integer.parseInt(sc.nextLine());
        boolean sair = false;

        switch (opcao) {
            case 1 -> {aba.cadastrar(agenda);}
            case 2 -> {aba.listarTodos(agenda);}
            case 3 -> {aba.listar(agenda);}
            case 4 -> {aba.editar(agenda);}
            case 5 -> {aba.excluir(agenda); }
            case 0 -> {System.out.println("Saindo...");
                sair = true;
            }
            default -> {System.out.println("Insira uma opção válida.");
                abrirMenu();}
        }
        if (sair==false){
        abrirMenu();}
    }

}

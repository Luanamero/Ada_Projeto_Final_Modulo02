package edu.ada.view;
import edu.ada.view.Menu;

import edu.ada.agenda.Contato;
import edu.ada.midia.Filme;
import edu.ada.midia.Jogo;
import edu.ada.midia.Livro;
import edu.ada.midia.Midia;

import java.util.Scanner;

public class SubAbas {
    Scanner sc = new Scanner(System.in);

    int opcao;
    Midia midia;



    public Midia abrirOpcao(){

        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar Jogo");
        System.out.println("3. Cadastrar Filme");

        try {
            opcao = Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println();
            System.out.println("Por favor insira um número!");
            abrirOpcao();
        }

        switch (opcao) {
            case 1 -> {midia = cadastrarLivro();}
            case 2 -> {midia = cadastrarJogo();}
            case 3 -> {midia = cadastrarFilme(); }
            default ->  {System.out.println("Insira uma opção válida.");
                abrirOpcao();
                }
        }


        return midia;
    };


    private Midia cadastrarFilme() {


        System.out.println("Digite o titulo ");
        String titulo = sc.nextLine();
        System.out.println("Digite o genero");
        String genero = sc.nextLine();
        System.out.println("Digite o ano de lançamento");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o Avaliaçao ");
        int avaliacao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o diretor");
        String diretor = sc.nextLine();
        System.out.println("Digite o pais de origem");
        String origem = sc.nextLine();
        System.out.println("Recebeu um oscar?");
        boolean oscar = sc.nextBoolean();
        sc.nextLine();

        Filme filme = new Filme(titulo, genero, ano, avaliacao, diretor, origem, oscar);
        return filme;
    }
    private Midia cadastrarLivro() {
        System.out.println("Digite o titulo ");
        String titulo = sc.nextLine();
        System.out.println("Digite o genero");
        String genero = sc.nextLine();
        System.out.println("Digite o ano de lançamento");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o Avaliaçao ");
        int avaliacao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o pais de origem");
        String origem = sc.nextLine();
        System.out.println("Digite o autor");
        String autor = sc.nextLine();
        System.out.println("Idioma lido");
        String  idioma = sc.nextLine();

        Livro livro = new Livro(titulo, genero, ano, avaliacao, origem, autor, idioma);


        return  livro;}


    private Midia cadastrarJogo() {

        System.out.println("Digite o titulo ");
        String titulo = sc.nextLine();
        System.out.println("Digite o genero");
        String genero = sc.nextLine();
        System.out.println("Digite o ano de lançamento");
        int ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o Avaliaçao ");
        int avaliacao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o pais de origem");
        String origem = sc.nextLine();
        System.out.println("Digite o dev");
        String dev = sc.nextLine();
        System.out.println("Qual estilo de jogo");
        String  estiloJogo = sc.nextLine();

        Jogo jogo = new Jogo(titulo, genero, ano, avaliacao, origem, dev,estiloJogo);


        return  jogo;}
}

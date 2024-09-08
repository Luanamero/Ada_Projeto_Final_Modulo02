package edu.ada.view;

import edu.ada.midia.Filme;
import edu.ada.midia.Jogo;
import edu.ada.midia.Livro;
import edu.ada.midia.Midia;

import java.util.Scanner;

public class SubAbas {
    Scanner sc = new Scanner(System.in);

    public Midia abrirOpcao(){

        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar Jogo");
        System.out.println("3. Cadastrar Filme");

        int opcao =  Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1 -> {return cadastrarLivro();}
            case 2 -> {return cadastrarJogo();}
            case 3 -> {return cadastrarFilme(); }
            default ->  {System.out.println("Insira uma opção válida."); return null;}
        }
    };
    private Midia cadastrarFilme() {


        System.out.println("Digite o titulo ");
        String titulo = sc.nextLine();
        System.out.println("Digite o genero");
        String genero = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite o ano de lançamento");
        int ano = sc.nextInt();
        System.out.println("Digite o Avaliaçao ");
        int avaliacao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o diretor");
        String diretor = sc.nextLine();
        System.out.println("Digite o pais de origem");
        String origem = sc.nextLine();
        System.out.println("Recebeu um oscar?");
        boolean oscar = sc.nextBoolean();

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

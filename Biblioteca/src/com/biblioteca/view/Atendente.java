package com.biblioteca.view;

import com.biblioteca.model.Livro;
import java.util.Scanner;

public class Atendente {

	Scanner leia;
	
	public Atendente(){
		leia = new Scanner(System.in);
	}
	
	public int exibirMenu() {
		System.out.println("-- Biblioteca --");
		System.out.println("1. Cadastrar livro");
		System.out.println("2. Listar livros");
		System.out.println("3. Remover livro");
		System.out.println("4. Pesquisar livro");
		System.out.println("5. Editar livro");
		System.out.println("6. Contar livros");
		System.out.println("0. Encerrar programa");
		
		int opcaoMenu = leia.nextInt();
		leia.nextLine();
		return opcaoMenu;
	}
	
	public String definirTitulo() {
		System.out.println("Título: ");
		String titulo = leia.nextLine();
		return titulo;
	}
	
	public String definirAutor() {
		System.out.println("Autor: ");
		String autor = leia.nextLine();
		return autor;
	}
	
	public int definirAnoPub() {
		System.out.println("Ano de publicação: ");
		int anoPub = leia.nextInt();
		leia.nextLine();
		return anoPub;
	}
	
	public String definirGenero() {
		System.out.println("Gênero: ");
		String genero = leia.nextLine();
		return genero;
	}
	
	public void opcaoInvalida() {
		System.out.println("Opção escolhida inválida! Selecione novamente.");
		System.out.println(" ");
	}
	
	public void listarLivros(Livro livro) {
		System.out.println(" ");
		System.out.println("Título: " + livro.getTitulo());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Ano de publicação: " + livro.getAnoPub());
		System.out.println("Gênero: " + livro.getGenero());
		System.out.println("---------------------------------");
	}
	
	public String removerLivro() {
		System.out.println("Nome do livro para exclusão: ");
		String nome = leia.nextLine();
		return nome;
	}
	
	public void livroRemovido(String titulo) {
		System.out.println("O livro " + titulo + " foi removido.");
		System.out.println(" ");
	}
	
	public void naoEncontrado() {
		System.out.println("Livro não encontrado no sistema.");
		System.out.println(" ");
	}
	
	public void sistemaEncerrado() {
		System.out.println("Sistema encerrado.");
	}
	
	public String pesquisarLivro() {
		System.out.println("Título do livro para pesquisa: ");
		String titulo = leia.nextLine();
		return titulo;
	}
	
	public String editarLivro() {
		System.out.println("Título do livro para edição: ");
		String titulo = leia.nextLine();
		return titulo;
	}
	
	public void livroEdicao() {
		System.out.println("O livro a ser editado é: ");
	}
	
	public String editarTitulo(Livro livro) {
		System.out.println("Novo título: ");
		String titulo = leia.nextLine();
		return titulo;
	}
	
	public String editarAutor(Livro livro) {
		System.out.println("Novo autor: ");
		String autor = leia.nextLine();
		return autor;
	}
	
	public int editarAnoPub(Livro livro) {
		System.out.println("Novo ano de publicação: ");
		int anoPub = leia.nextInt();
		leia.nextLine();
		return anoPub;
	}
	
	public String editarGenero(Livro livro) {
		System.out.println("Novo gênero: ");
		String genero = leia.nextLine();
		return genero;
	}
	
	public void editando() {
		System.out.println("Insira as novas informações: ");
	}
	
	public void contagem(int contagem) {
		System.out.println("A quantidade de livros cadastrados é: " + (contagem + 1));
		System.out.println(" ");
	}
}

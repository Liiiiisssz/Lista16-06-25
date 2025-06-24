package com.filme.view;

import java.util.Scanner;

import com.filme.model.Filme;

public class Interface {

	Scanner leia;
	
	public Interface() {
		leia = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("-- Cinema --");
		System.out.println("1. Cadastrar filme");
		System.out.println("2. Listar todos os filmes");
		System.out.println("3. Remover filme");
		System.out.println("4. Buscar filme por título");
		System.out.println("5. Editar filme");
		System.out.println("6. Exibir total cadastrado");
		int escolha = leia.nextInt();
		leia.nextLine();
		return escolha;
	}
	
	public void opcaoInvalida() {
		System.out.println("Opção selecionada inválida!");
		System.out.println("");
	}
	
	public void encerrar() {
		System.out.println("Sistema encerrado.");
	}
	
	public String inserirTitulo() {
		System.out.println("Título: ");
		String titulo = leia.nextLine();
		return titulo;
	}
	
	public String inserirGenero() {
		System.out.println("Gênero: ");
		String genero = leia.nextLine();
		return genero;
	}
	
	public int inserirDuracao() {
		System.out.println("Duração: ");
		int duracao = leia.nextInt();
		leia.nextLine();
		return duracao;
	}
	
	public int inserirAnoLancamento() {
		System.out.println("Ano de lançamento: ");
		int anoLancamento = leia.nextInt();
		leia.nextLine();
		return anoLancamento;
	}
	
	public void listar(Filme filme) {
		System.out.println("Título: " + filme.getTitulo());
		System.out.println("Gênero: " + filme.getGenero());
		System.out.println("Duração: " + filme.getDuracao());
		System.out.println("Ano de lançamento: "+ filme.getAnoLancamento());
		System.out.println("---------------------------------");
	}
	
	public String remover() {
		System.out.println("Título do filme para remoção:");
		String titulo = leia.nextLine();
		return titulo;
	}
	
	public void removido(String titulo) {
		System.out.println("O filme " + titulo + " foi removido.");
		System.out.println("");
	}
	
	public void naoEncontrado() {
		System.out.println("Filme não encontrado.");
		System.out.println("");
	}
	
	public String pesquisar() {
		System.out.println("Título do filme:");
		String titulo = leia.nextLine();
		return titulo;
	}
	
	public void edicao() {
		System.out.println("O filme a ser editado é:");
	}
	
	public void editando() {
		System.out.println("Insira os novos dados:");
		System.out.println("");
	}
	
	public void contagem(int total) {
		System.out.println("Filmes cadastrados no sistema: " + (total + 1));
	}
}

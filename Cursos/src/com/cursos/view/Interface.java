package com.cursos.view;

import java.util.Scanner;
import com.cursos.model.Curso;

public class Interface {

	Scanner leia;
	
	public Interface() {
		leia = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("-- Cursos --");
		System.out.println("1. Cadastrar curso");
		System.out.println("2. Listar cursos");
		System.out.println("3. Remover curso");
		System.out.println("4. Pesquisar curso");
		System.out.println("5. Editar dados do curso");
		System.out.println("6. Exibir total de cursos");
		System.out.println("0. Encerrar programa");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}
	
	public void opcaoInvalida() {
		System.out.println("Opção selecionada inválida!");
		System.out.println("");
	}
	
	public void encerrar() {
		System.out.println("Programa encerrado.");
	}
	
	public String inserirNome() {
		System.out.println("Nome: ");
		String nome = leia.nextLine();
		return nome;
	}
	
	public int inserirDuracao() {
		System.out.println("Duração: ");
		int duracao = leia.nextInt();
		leia.nextLine();
		return duracao;
	}
	
	public String inserirNivel() {
		System.out.println("Nível: ");
		String nivel = leia.nextLine();
		return nivel;
	}
	
	public int inserirVagas() {
		System.out.println("Vagas: ");
		int vagas = leia.nextInt();
		leia.nextLine();
		return vagas;
	}
	
	public void listar(Curso curso) {
		System.out.println("Nome: " + curso.getNome());
		System.out.println("Duração: " + curso.getDuracao());
		System.out.println("Nível: " + curso.getNivel());
		System.out.println("Vagas: " + curso.getVagas());
		System.out.println("-----------------------------");
	}
	
	public String remover() {
		System.out.println("Nome do curso para remoção:");
		String nome = leia.nextLine();
		return nome;
	}
	
	public void removido(String nome) {
		System.out.println("O curso " + nome + " foi removido.");
		System.out.println("");
	}
	
	public void naoEncontrado() {
		System.out.println("O curso não foi encontrado.");
		System.out.println("");
	}
	
	public String pesquisar() {
		System.out.println("Insira o nome do curso: ");
		String nome = leia.nextLine();
		return nome;
	}
	
	public void edicao() {
		System.out.println("O curso a ser editado é:");
	}
	
	public void editando() {
		System.out.println("Insira as novas informações:");
		System.out.println("");
	}
	
	public void contagem(int total) {
		System.out.println("Cursos cadastrados no sistema: " + (total + 1));
		System.out.println("");
	}
}

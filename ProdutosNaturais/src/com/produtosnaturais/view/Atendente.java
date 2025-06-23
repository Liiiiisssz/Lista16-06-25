package com.produtosnaturais.view;

import java.util.Scanner;
import com.produtosnaturais.model.Suplemento;

public class Atendente {

	Scanner leia;
	
	public Atendente() {
		leia = new Scanner(System.in);
	}
	
	public int mostrarMenu() {
		System.out.println("");
		System.out.println("-- Produtos Naturais --");
		System.out.println("1. Cadastrar suplemento");
		System.out.println("2. Listar todos os suplementos");
		System.out.println("3. Remover suplemento por nome");
		System.out.println("4. Pesquisa por nome");
		System.out.println("5. Editar suplemento");
		System.out.println("6. Contagem de suplementos cadastrados");
		System.out.println("0. Encerrar programa");
		int escolha = leia.nextInt();
		leia.nextLine();
		return escolha;
	}
	
	public void opcaoInvalida() {
		System.out.println("Opção escolhida inválida!");
	}
	
	public String inserirNome() {
		System.out.println("Nome: ");
		String nome = leia.nextLine();
		return nome;
	}
	
	public double inserirPreco() {
		System.out.println("Preço: ");
		double preco = leia.nextDouble();
		leia.nextLine();
		return preco;
	}
	
	public int inserirQuantidade() {
		System.out.println("Quantidade: ");
		int quantidade = leia.nextInt();
		leia.nextLine();
		return quantidade;
	}
	
	public String inserirMarca() {
		System.out.println("Marca: ");
		String marca = leia.nextLine();
		return marca;
	}
	
	public void listar(Suplemento suplemento) {
		System.out.println("");
		System.out.println("Nome: " + suplemento.getNome());
		System.out.println("Preço: " + suplemento.getPreco());
		System.out.println("Quantidade: " + suplemento.getQuantidade());
		System.out.println("Marca: " + suplemento.getMarca());
		System.out.println("---------------------------------------------");
	}
	
	public String remover() {
		System.out.println("");
		System.out.println("Nome do suplemento para remoção: ");
		String nome = leia.nextLine();
		return nome;
	}
	
	public void removido(String nome) {
		System.out.println("Suplemento " + nome + " removido com sucesso!");
		System.out.println("");
	}
	
	public void naoEncontrado() {
		System.out.println("Suplemento não encontrado.");
		System.out.println("");
	}
	
	public String pesquisar() {
		System.out.println("Nome do suplemento: ");
		String nome = leia.nextLine();
		return nome;
	}
	
	public void edicao() {
		System.out.println("O suplemento a ser editado é:");
	}
	
	public void newInfo() {
		System.out.println("Insira as novas informações:");
		System.out.println("");
	}
	
	public void contagem(int total) {
		System.out.println("");
		System.out.println("Quantidade de suplementos cadastrados: " + (total + 1));
	}
	
	public void encerrarPrograma() {
		System.out.println("Programa encerrado.");
	}
}

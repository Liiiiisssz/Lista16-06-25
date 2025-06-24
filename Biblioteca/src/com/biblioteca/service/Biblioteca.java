package com.biblioteca.service;

import com.biblioteca.view.Atendente;
import com.biblioteca.model.Livro;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

	List<Livro> listLivros;
	
	public Biblioteca() {
		listLivros = new ArrayList<>();
	}
	
	public void gerenciarLivros(int opcaoEscolhida, Atendente atendente) {
		switch(opcaoEscolhida) {
		case 1 ->{
			System.out.println(" ");
			String titulo = atendente.definirTitulo();
			String autor = atendente.definirAutor();
			int anoPub = atendente.definirAnoPub();
			String genero = atendente.definirGenero();
			System.out.println(" ");
			
			Livro livro = new Livro(titulo, autor, anoPub, genero);
			listLivros.add(livro);
		}
		
		case 2 ->{
			for (Livro livro : listLivros) {
				atendente.listarLivros(livro);
			}
		}
		
		case 3 ->{
			String titulo = atendente.removerLivro();
			boolean removido = false;
			System.out.println(" ");
			
			for(int indice = 0; indice < listLivros.size(); indice++) {
				if(listLivros.get(indice).getTitulo().equalsIgnoreCase(titulo)) {
					listLivros.remove(indice);
					removido = true;
					break;
				}
			}
			if(removido) {
				atendente.livroRemovido(titulo);
				
			} else {
				atendente.naoEncontrado();
			}
		}
		
		case 4 ->{
			String titulo = atendente.pesquisarLivro();
			
			for (Livro livro : listLivros) {
		        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
		            atendente.listarLivros(livro);
		        }
		    }
		}
		
		case 5 ->{
			String titulo = atendente.editarLivro();
			
			for (Livro livro : listLivros) {
		        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
		        	atendente.livroEdicao();
		            atendente.listarLivros(livro);
		            atendente.editando();
		            
		            String novoTitulo = atendente.editarTitulo(livro);
		            String novoAutor = atendente.editarAutor(livro);
		            int novoAnoPub = atendente.editarAnoPub(livro);
		            String novoGenero = atendente.editarGenero(livro);
		            
		            livro.setTitulo(novoTitulo);
		            livro.setAutor(novoAutor);
		            livro.setAnoPub(novoAnoPub);
		            livro.setGenero(novoGenero);
		        }
		    }
		}
		
		case 6 ->{
			int total = 0;
			
			for(int contagem = 0; contagem < listLivros.size(); contagem++) {
				total = contagem;
			}
			atendente.contagem(total);
		}
		}
	}
}

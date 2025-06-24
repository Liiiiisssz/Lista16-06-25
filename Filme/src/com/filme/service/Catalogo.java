package com.filme.service;

import java.util.List;
import java.util.ArrayList;
import com.filme.model.Filme;
import com.filme.view.Interface;

public class Catalogo {

	List<Filme> listFilme;
	
	public Catalogo() {
		listFilme = new ArrayList<>();
	}
	
	public void gerenciar(int opcao, Interface interfac) {
		switch(opcao) {
		case 1 ->{
			System.out.println("");
			String titulo = interfac.inserirTitulo();
			String genero = interfac.inserirGenero();
			int duracao = interfac.inserirDuracao();
			int anoLanc = interfac.inserirAnoLancamento();
			
			Filme filme = new Filme(titulo, genero, duracao, anoLanc);
			listFilme.add(filme);
		}
		
		case 2 ->{
			for(Filme filme : listFilme) {
				interfac.listar(filme);
			}
		}
		
		case 3 ->{
			String titulo = interfac.remover();
			boolean removido = false;
			System.out.println("");
			
			for(int indice = 0; indice < listFilme.size(); indice++) {
				if(listFilme.get(indice).getTitulo().equalsIgnoreCase(titulo)) {
					listFilme.remove(indice);
					removido = true;
					break;
				}
			}
			if(removido) {
				interfac.removido(titulo);
			}else {
				interfac.naoEncontrado();
			}
		}
		
		case 4 ->{
			String titulo = interfac.pesquisar();
			boolean encontrado = false;
			
			for(Filme filme : listFilme) {
				if(filme.getTitulo().equalsIgnoreCase(titulo)) {
					interfac.listar(filme);
					encontrado = true;
				}
			}
			if(!encontrado) {
				interfac.naoEncontrado();
			}
		}
		
		case 5 ->{
			String titulo = interfac.pesquisar();
			boolean encontrado = false;
			
			for(Filme filme : listFilme) {
				if(filme.getTitulo().equalsIgnoreCase(titulo)) {
					interfac.edicao();
					interfac.listar(filme);
					interfac.editando();
					
					String newTitulo = interfac.inserirTitulo();
					String newGenero = interfac.inserirGenero();
					int newDuracao = interfac.inserirDuracao();
					int newAnoLanc = interfac.inserirAnoLancamento();
					
					filme.setTitulo(newTitulo);
					filme.setGenero(newGenero);
					filme.setDuracao(newDuracao);
					filme.setAnoLancamento(newAnoLanc);
					
					encontrado = true;
				}
			}
			if(!encontrado) {
				interfac.naoEncontrado();
			}
		}
		
		case 6 ->{
			int total = 0;
			
			for(int contagem = 0; contagem < listFilme.size(); contagem++) {
				total = contagem;
			}
			interfac.contagem(total);
		}
		
		case 0 ->{
			interfac.encerrar();
		}
		}
	}
}

package com.cursos.service;

import java.util.List;
import java.util.ArrayList;
import com.cursos.view.Interface;
import com.cursos.model.Curso;

public class Gerenciador {

	List<Curso> listCurso;
	
	public Gerenciador() {
		listCurso = new ArrayList<>();
	}
	
	public void gerenciar(int opcao, Interface interfac) {
		switch(opcao) {
		case 1 ->{
			String nome = interfac.inserirNome();
			int duracao = interfac.inserirDuracao();
			String nivel = interfac.inserirNivel();
			int vagas = interfac.inserirVagas();
			
			Curso curso = new Curso(nome, duracao, nivel, vagas);
			listCurso.add(curso);
		}
		
		case 2 ->{
			for(Curso curso : listCurso) {
				interfac.listar(curso);
			}
		}
		
		case 3 ->{
			String nome = interfac.remover();
			boolean removido = false;
			System.out.println("");
			
			for(int indice = 0; indice < listCurso.size(); indice++) {
				if(listCurso.get(indice).getNome().equalsIgnoreCase(nome)) {
					listCurso.remove(indice);
					removido = true;
					break;
				}
			}
			if(removido) {
				interfac.removido(nome);
			}else {
				interfac.naoEncontrado();
			}
		}
		
		case 4 ->{
			String nome = interfac.pesquisar();
			boolean encontrado = false;
			System.out.println("");
			
			for(Curso curso : listCurso) {
				if(curso.getNome().equalsIgnoreCase(nome)) {
					interfac.listar(curso);
					encontrado = true;
					break;
				}
			}
			if(!encontrado) {
				interfac.naoEncontrado();
			}
		}
		
		case 5 ->{
			String nome = interfac.pesquisar();
			boolean encontrado = false;
			System.out.println("");
			
			for(Curso curso : listCurso) {
				if(curso.getNome().equalsIgnoreCase(nome)) {
					interfac.edicao();
					interfac.listar(curso);
					interfac.editando();
					
					String newNome = interfac.inserirNome();
					int newDuracao = interfac.inserirDuracao();
					String newNivel = interfac.inserirNivel();
					int newVagas = interfac.inserirVagas();
					
					curso.setNome(newNome);
					curso.setDuracao(newDuracao);
					curso.setNivel(newNivel);
					curso.setVagas(newVagas);
					
					encontrado = true;
				}
			}
			if(!encontrado) {
				interfac.naoEncontrado();
			}
		}
		
		case 6 ->{
			int total = 0;
			
			for(int contagem = 0; contagem < listCurso.size(); contagem++) {
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

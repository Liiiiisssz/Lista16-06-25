package com.produtosnaturais.service;

import java.util.List;
import java.util.ArrayList;
import com.produtosnaturais.view.Atendente;
import com.produtosnaturais.model.Suplemento;

public class Estoque {

	List<Suplemento> listSuplemento;
	
	public Estoque() {
		listSuplemento = new ArrayList<>();
	}
	
	public void gerenciarSuplemento(int opcao, Atendente atendente) {
		switch(opcao) {
		case 1 ->{
			System.out.println("");
			String nome = atendente.inserirNome();
			double preco = atendente.inserirPreco();
			int quantidade = atendente.inserirQuantidade();
			String marca = atendente.inserirMarca();
			System.out.println("");
			
			Suplemento suplemento = new Suplemento(nome, preco, quantidade, marca);
			listSuplemento.add(suplemento);
		}
		
		case 2 ->{
			for(Suplemento suplemento : listSuplemento) {
				atendente.listar(suplemento);
			}
		}
		
		case 3 ->{
			String nome = atendente.remover();
			boolean removido = false;
			System.out.println("");
			
			for(int indice = 0; indice < listSuplemento.size(); indice++) {
				if(listSuplemento.get(indice).getNome().equalsIgnoreCase(nome)) {
					listSuplemento.remove(indice);
					removido = true;
					break;
				}
			}
			if(removido) {
				atendente.removido(nome);
			} else {
				atendente.naoEncontrado();
			}
		}
		
		case 4 ->{
			String nome = atendente.pesquisar();
			boolean encontrado = false;
			
			for(Suplemento suplemento : listSuplemento) {
				if(suplemento.getNome().equalsIgnoreCase(nome)) {
					atendente.listar(suplemento);
					encontrado = true;
				}
			}
			if(!encontrado) {
				atendente.naoEncontrado();
			}
		}
		
		case 5 ->{
			String nome = atendente.pesquisar();
			boolean encontrado = false;
			
			for(Suplemento suplemento : listSuplemento) {
				if(suplemento.getNome().equalsIgnoreCase(nome)) {
					atendente.edicao();
					atendente.listar(suplemento);
					atendente.newInfo();
					
					String newNome = atendente.inserirNome();
					double newPreco = atendente.inserirPreco();
					int newQuantidade = atendente.inserirQuantidade();
					String newMarca = atendente.inserirMarca();
					
					suplemento.setNome(newNome);
					suplemento.setPreco(newPreco);
					suplemento.setQuantidade(newQuantidade);
					suplemento.setMarca(newMarca);
					
					encontrado = true;
				}
			}
			if(!encontrado) {
				atendente.naoEncontrado();
			}
		}
		
		case 6 ->{
			int total = 0;
			
			for(int contagem = 0; contagem < listSuplemento.size(); contagem++) {
				total = contagem;
			}
			atendente.contagem(total);
		}
		
		case 0 ->{
			atendente.encerrarPrograma();
		}
		}
	}
}

package com.produtosnaturais;

import com.produtosnaturais.view.Atendente;
import com.produtosnaturais.service.Estoque;

public class AppProdutoNatural {

	public static void main(String[] args) {

		int escolha;
		
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		
		do {
			escolha = atendente.mostrarMenu();
			
			if(escolha < 0 || escolha > 6) {
				atendente.opcaoInvalida();
			}
			estoque.gerenciarSuplemento(escolha, atendente);
			
		} while(escolha != 0);
	}

}

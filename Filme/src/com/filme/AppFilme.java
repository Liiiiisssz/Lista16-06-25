package com.filme;

import com.filme.view.Interface;
import com.filme.service.Catalogo;

public class AppFilme {

	public static void main(String[] args) {

		int opcao;
		
		Interface interfac = new Interface();
		Catalogo catalogo = new Catalogo();
		
		do {
			opcao = interfac.menu();
			
			if(opcao < 0 || opcao > 6) {
				interfac.opcaoInvalida();
			}
			catalogo.gerenciar(opcao, interfac);
			
		} while(opcao != 0);
	}
}

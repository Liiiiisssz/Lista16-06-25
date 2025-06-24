package com.biblioteca;

import com.biblioteca.view.Atendente;
import com.biblioteca.service.Biblioteca;

public class AppBiblioteca {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Biblioteca gerenciador = new Biblioteca();
		
		int opcaoEscolhida;
		
		do {
			opcaoEscolhida = atendente.exibirMenu();
			
			if(opcaoEscolhida < 0 || opcaoEscolhida > 6) {
				atendente.opcaoInvalida();
			}
			gerenciador.gerenciarLivros(opcaoEscolhida, atendente);
			
		} while(opcaoEscolhida != 0 || opcaoEscolhida < 0 || opcaoEscolhida > 6);
		
		atendente.sistemaEncerrado();
	}
}
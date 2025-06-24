package com.cursos;

import com.cursos.view.Interface;
import com.cursos.service.Gerenciador;

public class AppCursos {

	public static void main(String[] args) {

		int opcao;
		
		Interface interfac = new Interface();
		Gerenciador gerenciador = new Gerenciador();
		
		do {
			opcao = interfac.menu();
			
			if(opcao < 0 || opcao > 6) {
				interfac.opcaoInvalida();
			}
			gerenciador.gerenciar(opcao, interfac);
		} while (opcao != 0);
	}

}

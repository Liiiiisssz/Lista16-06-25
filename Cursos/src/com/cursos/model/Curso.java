package com.cursos.model;

public class Curso {

	private String nome;
	private int duracao;
	private String nivel;
	private int vagas;
	
	public Curso() {
		this.nome = "";
		this.duracao = 0;
		this.nivel = "";
		this.vagas = 0;
	}
	
	public Curso(String nome, int duracao, String nivel, int vagas) {
		this.nome = nome;
		this.duracao = duracao;
		this.nivel = nivel;
		this.vagas = vagas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
}

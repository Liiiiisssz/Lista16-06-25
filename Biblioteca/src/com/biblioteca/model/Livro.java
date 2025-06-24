package com.biblioteca.model;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPub;
	private String genero;
	
	public Livro() {
		this.titulo = "";
		this.autor = "";
		this.anoPub = 0;
		this.genero = "";
	}
	
	public Livro(String titulo, String autor, int anoPub, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPub = anoPub;
		this.genero = genero;
	}

	public int getAnoPub() {
		return anoPub;
	}

	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}

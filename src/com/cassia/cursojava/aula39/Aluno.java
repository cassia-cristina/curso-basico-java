package com.cassia.cursojava.aula39;

public class Aluno extends Pessoa {
	//Conceitos de Herança, modificadores de acesso e protected
	
	private String[] cursos;
	private double[] notas;
	
	public void verificarAcesso() {
		super.nomeVisibilidade = "Modificadores";
	}

	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String[] cursos) {
		super(nome, endereco, telefone);
		this.cursos = cursos;
	}

	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}

}

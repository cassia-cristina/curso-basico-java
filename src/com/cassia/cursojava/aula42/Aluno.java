package com.cassia.cursojava.aula42;

public class Aluno {
	//Palavra chave final
	
	private String[] cursos;
	private double[] notas;
	

	public Aluno() {
	}
	
	public Aluno(String[] cursos) {
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
	
	public void imprimirCursos() {
		for (String cursos : this.getCursos()){
			System.out.println(cursos);
		}
	}
	


}

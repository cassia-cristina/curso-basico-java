package com.cassia.cursojava.aula43;
import java.util.Arrays;

public class Aluno {
	//Utilizando a classe Object
	
	private String[] cursos;
	private double[] notas;

	public Aluno() { }
	
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
	
	@Override
	public String toString() {
		return "Aluno [cursos=" + Arrays.toString(cursos) + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;		
		if(Arrays.equals(cursos, other.cursos))
			return true;
		return false;
	}
	
	/*
	 * public String toString() { String s = "Cursos: "; for (String cursos :
	 * this.getCursos()){ s += cursos + " "; } s += "\nNotas: "; for (double notas :
	 * this.getNotas()){ s += notas + " "; } return s; }
	 */
	
}

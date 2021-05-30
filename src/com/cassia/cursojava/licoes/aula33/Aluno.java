package com.cassia.cursojava.licoes.aula33;

public class Aluno {
	
	private String nomeAluno;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}

	public Aluno(String nomeAluno, String matricula, String nomeCurso) {
		this.nomeAluno = nomeAluno;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	public void mostrarInfo() {
		System.out.println("Nome do aluno: " + nomeAluno);
		System.out.println("Matrícula do aluno: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for(int i=0; i<notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i] + ":");
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public boolean verificarAprovado(int indice) {
		
		if(obterMedia(indice) >= 7) {
			return true;
		} 
			return false;
	}
	
	public double obterMedia(int indice) {
		double soma = 0;
		for(int i=0; i<notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		double media = soma/4;
		return media;
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
	}
	
	public void setNotaDisciplinaPos(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}
	

}

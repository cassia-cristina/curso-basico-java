package com.cassia.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		aluno.setEndereco("Rua 2, nr 002");
		professor.setEndereco("Rua 3, nr 003");
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
		
		
	}

}

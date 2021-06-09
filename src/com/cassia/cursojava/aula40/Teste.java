package com.cassia.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1, nr 001");
		aluno.setEndereco("Rua 2, nr 002");
		professor.setEndereco("Rua 3, nr 003");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());

	}

}

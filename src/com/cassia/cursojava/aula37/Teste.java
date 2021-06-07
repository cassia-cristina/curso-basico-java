package com.cassia.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		
		//Testando classes com conceitos de herança
		Aluno aluno = new Aluno();
		aluno.setNome("Maria");
		System.out.println(aluno.getNome());
		
		Professor professor = new Professor();
		professor.getEndereco();

	}

}

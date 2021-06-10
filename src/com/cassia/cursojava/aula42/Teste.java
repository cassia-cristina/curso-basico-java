package com.cassia.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		pessoa.setEndereco("Rua teste");
		
		String[] cursos = {"A", "B"};
		aluno.setCursos(cursos);
		
		professor.setNomeCurso("Matemática");	
		System.out.println(pessoa.getEndereco());
		aluno.imprimirCursos();
		System.out.println(professor.getNomeCurso());
		
		System.out.println(Constantes.URL_SITE);
		
	}

}

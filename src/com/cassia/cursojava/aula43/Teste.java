package com.cassia.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();		
		String[] cursos = {"Matemática", "Português"};
		aluno.setCursos(cursos);
		
		double[] notas = {8.5, 8, 7, 6};
		aluno.setNotas(notas);		
		//System.out.println(aluno);
		
		Aluno aluno2 = new Aluno();
		String[] cursos2 = {"Matemática", "Português"};
		aluno2.setCursos(cursos2);
		
		double[] notas2 = {8.5, 9, 7, 5};
		aluno2.setNotas(notas2);
		
		//Verificando se os cursos são iguais para os dois objetos
		System.out.println(aluno.equals(aluno2));
		

	}

}

package com.cassia.cursojava.licoes.aula33;
import java.util.Scanner;

public class TesteAluno {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno");
		aluno.setNomeAluno(scan.next());
		
		System.out.println("Informe o nome do curso");
		aluno.setNomeCurso(scan.next());
		
		System.out.println("Informe a matrícula");
		aluno.setMatricula(scan.next());
		
		aluno.setNomeDisciplinas(new String[3]);
		
		for(int i=0; i<aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Informe nome da disciplina " + (i+1) + ":");
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		for(int i=0; i<aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
			for(int j=0; j<aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Informe a nota " + (j+1) + ":");
				aluno.setNotaDisciplinaPos(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i=0; i<aluno.getNomeDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Média: " + aluno.obterMedia(i) + " - Aprovado.");
			} else {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - Média: " + aluno.obterMedia(i) + " - Reprovado.");
			}
		}
		
		
	}

}

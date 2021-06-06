package com.cassia.cursojava.licoes.aula36;
import java.util.Scanner;

public class TesteCurso {
	
	private static Scanner scan;
	private static Scanner scan2;
	private static Scanner scan3;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		scan2 = new Scanner(System.in);
		scan3 = new Scanner(System.in);
		
		System.out.println("Informe o nome do curso:");
		String nome = scan.nextLine();
		
		System.out.println("Informe o horário do curso:");
		String horario = scan.nextLine();
		
		System.out.println("Informe o nome do professor:");
		String nomeProf = scan.nextLine();
		
		System.out.println("Informe o departamento do professor:");
		String depProf = scan.nextLine();
		
		System.out.println("Informe o e-mail do professor:");
		String emailProf = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor prof = new Professor();
		prof.setNome(nomeProf);
		prof.setDepartamento(depProf);
		prof.setEmail(emailProf);
		
		curso.setProfessor(prof);
		
		Aluno[] alunos = new Aluno[5];
		
		String nomeAluno;
		String matrAluno;
		
		System.out.println("Alunos:");
		for(int i=0; i<5; i++) {
			
			System.out.println("Infome nome do aluno " + (i+1));
			nomeAluno = scan2.nextLine();
						
			System.out.println("Infome a matrícula do aluno " + (i+1));
			matrAluno = scan3.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0; j<4; j++) {
				System.out.println("Informe a nota " + (j+1));
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matrAluno);
			aluno.setNotas(notas);
			alunos[i] = aluno;
			
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
		
	}

}

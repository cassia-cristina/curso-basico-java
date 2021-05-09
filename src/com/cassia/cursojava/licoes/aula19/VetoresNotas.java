package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class VetoresNotas {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];
		
		for(int i=0; i<notas1.length; i++) {
			
			System.out.println("Informe a nota 1 do aluno " + (i+1) + ":");
			notas1[i] = scan.nextDouble();
			
			System.out.println("Informe a nota 2 do aluno " + (i+1) + ":");
			notas2[i] = scan.nextDouble();
			
			resultados[i] = (notas1[i] + notas2[i]) / 2;
		}
		
		
		for(int i=0; i<notas1.length; i++) {
			
			System.out.println("Resultados do aluno " + (i+1) + ":");
			System.out.println("Nota 1: " + notas1[i]);
			System.out.println("Nota 2: " + notas2[i]);
			
			if(resultados[i] >= 7) {
				System.out.println("Média: " + resultados[i] + " - Aprovado!");
				System.out.println();
			} else {
				System.out.println("Média: " + resultados[i] + " - Reprovado!");
				System.out.println();
			}
			
		}
	
		
	}

}

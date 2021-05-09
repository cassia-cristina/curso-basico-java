package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class Vetores6 {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Vetor A - Informe um número para a posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Vetor B - Informe um número para a posição " + i);
			vetorB[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i]; 
		}
		
		System.out.print("Vetor A = ");
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor C = ");
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
	}

}

package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class Vetores {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
	
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}

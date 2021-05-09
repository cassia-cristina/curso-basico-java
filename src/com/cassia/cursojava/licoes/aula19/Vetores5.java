package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class Vetores5 {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		//Vetor B é Vetor A multiplicado pelo seu índice
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
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

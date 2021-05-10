package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class VetorNumInvertidos {
	
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Informe um número para a posição " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[vetorA.length - 1 - i] = vetorA[i];
			
		}

		System.out.print("Vetor A = ");
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print(vetorA[i] + " ");
			
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for(int i=0; i<vetorB.length; i++) {
			
			System.out.print(vetorB[i] + " ");
			
		}
		
		
	}

}

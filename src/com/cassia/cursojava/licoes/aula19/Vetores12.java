package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class Vetores12 {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Vetor A = ");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Soma dos elementos do vetor A = ");
		
		for (int i=0; i<vetorA.length; i++) {
			soma += vetorA[i];
		}
		
		System.out.print(soma);

	}

}

package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class Vetores11 {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Vetor A = ");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();	
		
		int qtdPares = 0;
		for (int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.print("Qtde de números pares = ");
		System.out.print(qtdPares);

	}

}

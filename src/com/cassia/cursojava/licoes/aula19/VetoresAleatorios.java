package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class VetoresAleatorios {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int qtdZero = 0;
		int qtdUm = 0;
		
		for(int i=0; i<vetorA.length; i++ ) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
			if(vetorA[i] == 0) {
				qtdZero++;
			} else if(vetorA[i] == 1) {
				qtdUm++;
			}
			
		}
		
		System.out.print("Vetor A = ");
		
		for(int i=0; i<vetorA.length; i++ ) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Quantidade de números 0: " + qtdZero);
		System.out.println("Quantidade de números 1: " + qtdUm);
		
		double percZero = (qtdZero * 100) / vetorA.length;
		double percUm = (qtdUm * 100) / vetorA.length;
		
		System.out.println("Percentual de números 0: " + percZero + " %");
		System.out.println("Percentual de números 1: " + percUm + " %");
		
		
	}
	
	
}
		
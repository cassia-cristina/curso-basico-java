package com.cassia.cursojava.licoes.aula20;

public class ArrayFibonacci {
	
	public static void main(String[] args) {

		int[] vetor = new int[20];
	
		vetor[0] = 1;
		vetor[1] = 1;
		
		System.out.print(vetor[0] + " ");
		System.out.print(vetor[1] + " ");
		
		//os próximos = a soma dos dois anteriores
		
		for(int i=2; i<vetor.length; i++) {
			vetor[i] = (vetor[i-2]) + (vetor[i-1]); 
			System.out.print(vetor[i] + " ");
		}
	
	
	}
	
	
}

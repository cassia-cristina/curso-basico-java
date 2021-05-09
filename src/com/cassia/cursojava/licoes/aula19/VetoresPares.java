package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class VetoresPares {
	
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		int[] vetorA = new int[6];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Informe um valor para a posição " + (i+1));
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 !=0) {
				System.out.println("Foi informado um número ímpar!");
				break;
			} 
		}
		
	
		
	}

}

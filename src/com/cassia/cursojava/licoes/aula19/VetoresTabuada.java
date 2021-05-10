package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class VetoresTabuada {
	
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Informe o valor da posição A -" + i);
			vetorA[i] = scan.nextInt();
			
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.println("Tabuada de " + vetorA[i]);
			
			for(int j=1; j<=10; j++) {
				
				System.out.println(j + " x " + vetorA[i] + " = " + (vetorA[i] * j));
				
			}
			
			System.out.println();
		}
		
		
		
	}

}

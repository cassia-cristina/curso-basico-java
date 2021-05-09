package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class VetorIdades {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] idade = new int[10];
		
		for(int i=0; i<idade.length; i++) {
			System.out.println("Informe a idade da pessoa " + (i+1) + " :");
			idade[i] = scan.nextInt();
		}
		
		int menorIdade = idade[0];
		int indexMenor = 0;
		int maiorIdade = idade[0];
		int indexMaior = 0;
		
		for(int i=1; i<idade.length; i++) {
			
			if(idade[i] < menorIdade) {
				menorIdade = idade[i];
				indexMenor = i;
			} else if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				indexMaior = i;
			}
			
		}
		
		System.out.print("Idades = ");
		
		for(int i=0; i<idade.length; i++) {
			System.out.print(idade[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Maior idade: " + maiorIdade + " Posição: " + indexMaior);
		System.out.println("Menor idade: " + menorIdade + " Posição: " + indexMenor);
	}

}

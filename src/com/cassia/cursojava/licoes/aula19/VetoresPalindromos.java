package com.cassia.cursojava.licoes.aula19;
import java.util.Scanner;

public class VetoresPalindromos {
	
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		int[] numeros = new int[10];
		boolean palindromo = true;
		
		for(int i=0; i<(numeros.length); i++) {
			
			System.out.println("Informe um número inteiro:");
			numeros[i] = scan.nextInt();
		}
		
		for(int i=0; i<(numeros.length/2); i++) {
			
			if(numeros[i] != numeros[numeros.length - 1 - i]) {
				palindromo = false;
				break;
			}
			
			
		}
		
		System.out.print("Número = ");
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		if(palindromo) {
			System.out.print("É um número palíndromo");
		} else {
			System.out.print("Não é um número palíndromo");
		}
		
		
	}

}

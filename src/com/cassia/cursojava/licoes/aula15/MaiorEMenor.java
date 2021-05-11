package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class MaiorEMenor {
		
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int numero3 = scan.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1 + " é o maior número!");
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2 + " é o maior número!");
		} else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(numero3 + " é o maior número!");
		}
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println(numero1 + " é o menor número!");
		} else if (numero2 <= numero1 && numero2 <= numero3) {
			System.out.println(numero2 + " é o menor número!");
		} else if (numero3 <= numero1 && numero3 <= numero2) {
			System.out.println(numero3 + " é o menor número!");
		}
		
	}	

	

}

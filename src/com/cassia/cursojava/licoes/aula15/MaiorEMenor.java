package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class MaiorEMenor {
		
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe outro n�mero inteiro:");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe outro n�mero inteiro:");
		int numero3 = scan.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1 + " � o maior n�mero!");
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2 + " � o maior n�mero!");
		} else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(numero3 + " � o maior n�mero!");
		}
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println(numero1 + " � o menor n�mero!");
		} else if (numero2 <= numero1 && numero2 <= numero3) {
			System.out.println(numero2 + " � o menor n�mero!");
		} else if (numero3 <= numero1 && numero3 <= numero2) {
			System.out.println(numero3 + " � o menor n�mero!");
		}
		
	}	

	

}

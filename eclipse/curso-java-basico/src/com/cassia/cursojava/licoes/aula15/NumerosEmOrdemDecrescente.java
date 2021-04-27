package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class NumerosEmOrdemDecrescente {
		
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int numero3 = scan.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			// 3 - 2 - 1
			System.out.println(numero3 + " - " + numero2 + " - " + numero1);
		} else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
			// 3 - 1 - 2
			System.out.println(numero3 + " - " + numero1 + " - " + numero2);
		} else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
			// 2 - 1 - 3
			System.out.println(numero2 + " - " + numero1 + " - " + numero3);
		} else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2) {
			// 2 - 3 - 1
			System.out.println(numero2 + " - " + numero3 + " - " + numero1);
		} else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
			// 1 - 2 - 3
			System.out.println(numero1 + " - " + numero2 + " - " + numero3);
		} else if (numero2 <= numero1 && numero2 <= numero3 && numero2 <= numero1) {
			// 1 - 3 - 2
			System.out.println(numero1 + " - " + numero3 + " - " + numero2);
		}
		
		
	}	

}

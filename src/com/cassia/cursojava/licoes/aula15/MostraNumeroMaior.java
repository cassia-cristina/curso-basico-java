
package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class MostraNumeroMaior {
		
	
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
		
	}	

	/*
	public static int maiorValor(int[] valores) {
		int maior = 0;
		for (int i : valores) {
			if (maior < i) {
				maior = i;
			}
		}
		
		return maior;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n�mero inteiro:");
		int numero1 = scan.nextInt();
		System.out.println("Informe outro n�mero inteiro:");
		int numero2 = scan.nextInt();
		System.out.println("Informe outro n�mero inteiro:");
		int numero3 = scan.nextInt();
		int[] valores = {numero1, numero2, numero3};
		System.out.println(maiorValor(valores) + " � o maior n�mero digitado.");
		*/

}

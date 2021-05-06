package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class MostraTermos {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de n:");
		int n = scan.nextInt();
		double soma = 0;
		
		for (int i=1, j=1 ; i<=n; i++, j+=2) {
			System.out.print(i + "/" + j + " + ");
			soma += i/j;
		}

		System.out.println("\nSoma: " + soma);
	}

}

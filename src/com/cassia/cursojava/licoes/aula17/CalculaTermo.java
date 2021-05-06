package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class CalculaTermo {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de n:");
		int n = scan.nextInt();
		double soma = 1;
		String output = "";
		
		for (int i=2; i<=n; i++) {
			output += "1" + "/" + i + " + ";
			soma += 1/i;
		}
		
		System.out.println("1 + " + output);
		System.out.println("\nSoma: " + soma);
	}

}

package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class MenorProduto {
		
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Informe o valor do primeiro produto:");
		double prod1 = scan.nextDouble();
		
		System.out.println("Informe o valor do segundo produto");
		double prod2 = scan.nextDouble();
		
		System.out.println("Informe o valor do terceiro produto");
		double prod3 = scan.nextDouble();
		
				
		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O produto 1 é o mais barato!");
		} else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O produto 2 é o mais barato!");
		} else if (prod3 <= prod1 && prod3 <= prod2) {
			System.out.println("O produto 3 é o mais barato!");
		}
		
	}	

	

}

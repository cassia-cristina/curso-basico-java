package com.cassia.cursojava.licoes.aula35;
import java.util.Scanner;

public class TesteSomatorio {
	
	static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int num;

		do {
			System.out.println("Informe um número para calcular o seu somatório:");
			num = scan.nextInt();
			
			if(num<=0) {
				System.out.println("Número inválido, tente novamente!");
			}
		
		} while (num<=0);
		
		System.out.println("Somatório de " + num + " é: " + Somatorio.calcularSomatorio(num));
		
	}


}

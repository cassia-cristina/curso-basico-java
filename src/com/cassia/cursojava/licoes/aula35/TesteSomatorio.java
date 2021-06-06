package com.cassia.cursojava.licoes.aula35;
import java.util.Scanner;

public class TesteSomatorio {
	
	static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int num;

		do {
			System.out.println("Informe um n�mero para calcular o seu somat�rio:");
			num = scan.nextInt();
			
			if(num<=0) {
				System.out.println("N�mero inv�lido, tente novamente!");
			}
		
		} while (num<=0);
		
		System.out.println("Somat�rio de " + num + " �: " + Somatorio.calcularSomatorio(num));
		
	}


}

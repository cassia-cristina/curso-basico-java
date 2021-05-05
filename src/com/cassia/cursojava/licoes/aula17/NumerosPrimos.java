package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class NumerosPrimos {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro:");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i=2; i<num; i++ ) {
			if(num % i == 0) {
				System.out.println("N�o � um n�mero primo");
				primo = false;
				break;
			}

		}
		
		if(primo) {
			System.out.println(num + " � um n�mero primo!");
		}
	}

}

package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class ImprimeFatorial {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int num = scan.nextInt();
		int fatorial = num;
		
		
		for(int i=num-1; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println("Fatorial de " + num + " é: " + fatorial);
	}

}

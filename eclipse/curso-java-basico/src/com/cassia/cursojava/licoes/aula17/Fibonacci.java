package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class Fibonacci {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Informe o n-ésimo termo:");
		int num = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i = 3; i <= num; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
		

	}

}

package com.cassia.cursojava.licoes.aula13;
import java.util.Scanner;

public class MostraSoma {
	
	public static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		int a = scan.nextInt();
		
		System.out.println("Informe um segundo n�mero:");
		int b = scan.nextInt();
		
		int soma = a+b; 
		
		System.out.println("A soma dos dois n�meros �: " + soma);
		

	}

}

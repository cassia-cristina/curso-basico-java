package com.cassia.cursojava.aula13;
import java.util.Scanner;

public class OperadoresAritmeticos {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de a:");
		int a = scan.nextInt();
		System.out.println("Informe o valor de b:");
		int b = scan.nextInt();		
		
		int resultado = a + b;
		System.out.println(resultado);
		
		resultado = resultado + 5;
		System.out.println(resultado);
		
		resultado = resultado - 4;
		System.out.println(resultado);
		
		resultado = resultado % 5;
		System.out.println(resultado);
		
		resultado = resultado/4;
		System.out.println(resultado);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//Imprime resultado primeiro, adiciona depois
		System.out.println(resultado++);
		
		// Subtrai primeiro e depois imprime.
		System.out.println(--resultado);		
	

	}

}

package com.cassia.cursojava.aula13;
import java.util.Scanner;

public class OperadoresRelacionais {
	
	public static Scanner scan; 

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o Valor 1:");
		int valor1 = scan.nextInt();		
		System.out.println("Informe o Valor 2:");
		int valor2 = scan.nextInt();
		
		System.out.println(valor1 + " � igual a " + valor2 + "? " + (valor1 == valor2));		
		System.out.println(valor1 + " � diferente de " + valor2 + "? " + (valor1 != valor2));		
		System.out.println(valor1 + " � maior que " + valor2 + "? " + (valor1 > valor2));		
		System.out.println(valor1 + " � menor que " + valor2 + "? " + (valor1 < valor2));		
		System.out.println(valor1 + " � maior ou igual a " + valor2 + "? " + (valor1 >= valor2));		
		System.out.println(valor1 + " � menor ou igual a " + valor2 + "? " + (valor1 <= valor2));
		

	}

}


package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class ParOuImpar {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro:");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � par!");
		} else {
			System.out.println(numero + " � �mpar!");
		}
		
	}

}

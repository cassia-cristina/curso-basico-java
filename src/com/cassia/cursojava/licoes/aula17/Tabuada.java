package com.cassia.cursojava.licoes.aula17;

import java.util.Scanner;

public class Tabuada {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int num = scan.nextInt();
		
		System.out.println("Tabuada de "+ num + ":");
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}

	}

}

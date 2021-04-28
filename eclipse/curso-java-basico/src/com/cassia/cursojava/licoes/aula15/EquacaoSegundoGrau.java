package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class EquacaoSegundoGrau {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de a");
		int a = scan.nextInt();
		
		if(a==0) {
			System.out.println("Não é uma equação do segundo grau!");
		} else {
			
			System.out.println("Informe o valor de b");
			int b = scan.nextInt();
		
			System.out.println("Informe o valor de c");
			int c = scan.nextInt();
			
			double delta = (Math.pow(a, 2)) - (4*a*c);
		
		}

	}

}

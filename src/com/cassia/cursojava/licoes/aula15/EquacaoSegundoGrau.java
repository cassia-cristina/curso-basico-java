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
			
			double delta = (b*b) - (4*a*c);
			
			if (delta<0) {
				System.out.println("Delta negativo!");
			} else {
				System.out.println("Delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("X1: " + x1);
				System.out.println("X2: " + x2);
			}
		
		}

	}

}

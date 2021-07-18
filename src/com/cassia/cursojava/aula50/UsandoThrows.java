package com.cassia.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Informe um n�mero decimal:");
		try {
			double num = leNumero();
		} catch (Exception e) {
			System.out.println("Entrada inv�lida");
			e.printStackTrace();
		}

	}
	
	public static double leNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}

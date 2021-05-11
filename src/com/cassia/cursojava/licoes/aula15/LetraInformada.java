package com.cassia.cursojava.licoes.aula15;

import java.util.Scanner;

public class LetraInformada {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Informe F para feminino ou M para masculino:");
		String letra = scan.nextLine();
				
		/*
		letra = letra.toUpperCase();
		switch (letra) {
		case "F": System.out.println(letra + " - Feminino"); break;
		case "M": System.out.println(letra + " - Masculino"); break;
		default: System.out.println("Opção inválida!");
		*/
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Opção inválida!");
		}
		

	}

}

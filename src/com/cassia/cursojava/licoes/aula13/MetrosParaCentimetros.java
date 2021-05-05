package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MetrosParaCentimetros {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe um número em metros:");
		double metro = scan.nextDouble();
		
		double converteCentimetros = metro * 100;
		
		DecimalFormat formata = new DecimalFormat();
						
		System.out.println(formata.format(metro) + "m equivale a " + formata.format(converteCentimetros) + " centímetros.");

	}

}

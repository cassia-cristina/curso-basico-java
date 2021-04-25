package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaTemperaturaFarenheit {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius:");
		double celsius = scan.nextDouble();
		
		// Formula:  F =  (32 + (9/5 * C))

		double farenheit =  (32 + (9.0/5.0 * celsius));
		
		DecimalFormat df = new DecimalFormat (".00");
				
		System.out.println("Temperatura em Farenheit: " + df.format(farenheit));
		
		

	}

}

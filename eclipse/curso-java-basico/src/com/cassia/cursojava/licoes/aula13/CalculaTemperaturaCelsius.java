package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaTemperaturaCelsius {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit:");
		double far = scan.nextDouble();
		
		// Formula: C=(5*(F-32)/9)
		double celsius = (5 * (far-32)/9);
		
		DecimalFormat df = new DecimalFormat (".0000");
				
		System.out.println("Temperatura em Celsius: " + df.format(celsius) + " C");
		
		

	}

}

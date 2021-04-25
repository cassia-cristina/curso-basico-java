package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MostraArea {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo:");
		double raio = scan.nextDouble();
		
		//Exponencial
		double expo = Math.pow(raio, 2);
		
		//Calculo da area é A = π . r²
		double area = 3.14 * expo;
		
		DecimalFormat formata = new DecimalFormat(".00");
		
		System.out.println("A área do círculo é: " + formata.format(area));

	}

}

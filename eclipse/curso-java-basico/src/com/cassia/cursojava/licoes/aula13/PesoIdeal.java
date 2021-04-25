package com.cassia.cursojava.licoes.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PesoIdeal {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura:");
		double altura = scan.nextDouble();
		
		//Formula: (72.7*altura) - 58
		var pesoIdeal = (72.7*altura)-58;
		
		DecimalFormat df = new DecimalFormat(".000");
		
		System.out.println("Seu peso ideal é: " + df.format(pesoIdeal));

	}

}

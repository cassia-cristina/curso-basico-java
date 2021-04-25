package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MostraMedia {
	
	public static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe as notas 1, 2 ,3 e 4:");
		double nota1 = scan.nextDouble();		
		double nota2 = scan.nextDouble();		
		double nota3 = scan.nextDouble();		
		double nota4 = scan.nextDouble();
		
		var media =  (nota1 + nota2 + nota3 + nota4)/4;
		
		DecimalFormat formata = new DecimalFormat("###.00");
		
		System.out.println("A média final é: " + formata.format(media));

	}

}

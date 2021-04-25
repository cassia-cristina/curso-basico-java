package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DobroArea {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a medida de um dos lados do quadrado:");
		double lado = scan.nextDouble();
	
		// Calculo da area de um quadrado
		// A = L² ou A = b.h (base*altura)
		double area = Math.pow(lado, 2);
		double dobro = area*2;
		
		DecimalFormat formata = new DecimalFormat("###.00");
		
		System.out.println("O valor da área é: " + formata.format(area));
		System.out.println("O dobro da área é: " + formata.format(dobro));
		

	}

}

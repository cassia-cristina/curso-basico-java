package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class ComparaTemperaturas {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade desejada de temperaturas:");
		int qtd = scan.nextInt();
		
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double soma = 0;
		double media;
		
		for(int i=1; i<=qtd; i++) {
			
			System.out.println("Temperatura " + i + ":");
			double temp = scan.nextDouble();
			
			if(temp > maior) {
				maior = temp;
			} else if (temp < menor) {
				menor = temp;
			}
			
			soma +=temp;
			
		}
		
		media = soma/qtd;
		
		System.out.println("A maior temperatura informada é: " + maior);
		System.out.println("A menor temperatura informada é: " + menor);
		System.out.println("A média das temperaturas é: " + media);
		
	}
		
}
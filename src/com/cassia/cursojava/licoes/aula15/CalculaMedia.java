package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class CalculaMedia {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);	
		System.out.println("Informe a nota 1:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a nota 2:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media >=7 && media < 10) {
			System.out.println("Média: " + media + " Você foi Aprovado!");
		} else if(media == 10) {
			System.out.println("Média: " + media +" Você foi Aprovado com Distinção!");			
		} else {
			System.out.println("Média: " + media +" Você foi Reprovado!");
		}

	}

}

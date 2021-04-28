package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class CalculaMediaAluno {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);	
		System.out.println("Informe a nota 1:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a nota 2:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		String conceito = "";
		
		if(media >= 9 && media <= 10) {
			conceito = "A";
		} else if(media >= 7.5 && media < 9) {
			conceito = "B";
		} else if(media >= 6 && media < 7.5) {
			conceito = "C";
		} else if(media >= 4 && media < 6) {
			conceito = "D";
		} else if(media >= 0 && media < 4) {
			conceito = "E";
		} 
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println(conceito + " - Aprovado!");break;
		case "D":
		case "E": System.out.println(conceito + " - Reprovado!");break;
		}

	}

}

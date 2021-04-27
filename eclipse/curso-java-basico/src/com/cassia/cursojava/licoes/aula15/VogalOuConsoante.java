package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;
//import java.util.regex.Pattern;

public class VogalOuConsoante {

	public static Scanner scan;	

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);		
		
		/*
		var out = System.out;
		var numeros = Pattern.compile("[0-9]");
		var vogais = Pattern.compile("[a,e,i,o,u,A,E,I,O,U]");
		
		System.out.println("Informe uma letra do alfabeto:");
		String letra = scan.nextLine().toUpperCase();
		
		if (vogais.matcher(letra).matches()) {
			out.println("é uma vogal.");
		} else if (numeros.matcher(letra).matches()){
			out.println("é um número.");
		}
		else { 
			out.println("é uma consoante");

		}*/
		
		
		System.out.println("Informe uma letra do alfabeto:");
		String letra = scan.nextLine().toUpperCase();
		
				
		if(letra.length() > 1) {
			System.out.println("Não é uma letra válida!");
		} else {		
		 switch (letra) {
		 case "A":
		 case "E":
		 case "I":
		 case "O":
		 case "U": System.out.println(letra + " é uma vogal."); break;
		 default: System.out.println(letra + " é uma consoante.");
		
		 }
		
		}
	}

}

package com.cassia.cursojava.licoes.aula17;
import java.util.Scanner;

public class NotaValida {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		
		boolean invalida;
		
		do {
		System.out.println("Informe uma nota entre 0 e 10");
		double nota = scan.nextDouble();
		invalida = nota < 0 || nota >10;
		
		System.out.println(String.format("Nota informada é %s", invalida ? "inválida": "válida"));
		} while (invalida);		
	
		

	}

}

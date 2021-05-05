package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class AnoBissexto {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um ano:");
		int ano = scan.nextInt();
		
		if ( (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 !=0) ) {
			System.out.println(ano + " é um ano bissexto!");
		} else {
			System.out.println(ano + " não é um ano bissexto!");
		}
		

	}

}

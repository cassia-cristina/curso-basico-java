package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class Questionario {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Telefonou para a v�tima?");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();
		
		System.out.println("Mora perto da v�tima?");
		String resp3 = scan.next();
		
		System.out.println("Devia para a v�tima?");
		String resp4 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima?");
		String resp5 = scan.next();
		
				
		int cont = 0;
		
		if(resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		// 2 sim = suspeita
		// Entre 3 e 4 = c�mplice
		// 5 = assassino
		// senao = inocente
		if(cont == 2) {
			System.out.println("� supeita!");
		} else if(cont == 3 || cont == 4) {
			System.out.println("� c�mplice!");
		} else if(cont == 5) {
			System.out.println("Assassino!");
		} else {
			System.out.println("� inocente!");
		}
		

	}

}

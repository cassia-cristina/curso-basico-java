package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class LeiaSemana {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero corresponde ao dia da semana (ex.: 1 para Domingo, 2 para Segunda...)");
		int numero = scan.nextInt();
		
		switch(numero) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Ter�a"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("S�bado"); break;
		default: System.out.println("Op��o inv�lida");
		}

	}

}

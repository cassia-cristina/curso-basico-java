package com.cassia.cursojava.licoes.aula15;

import java.util.Scanner;

public class CalculaOperacoes {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe um segundo n�mero:");
		int numero2 = scan.nextInt();
		
		System.out.println("Informe a opera��o (+ - / *):");
		String operacao = scan.next();
		
		int resultado = 0;
		boolean valida = true;
		
		switch(operacao){
			case "+": resultado = numero1 + numero2; break;
			case "-": resultado = numero1 - numero2; break;
			case "/": resultado = numero1 / numero2; break;
			case "*": resultado = numero1 * numero2; break;
			default: System.out.println("Opera��o inv�lida!");
					 valida = false;
		}
		
		if(valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if(resultado >= 0) {
				System.out.println("� positivo!");
			} else {
				System.out.println("� negativo!");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("� par!");
			} else {
				System.out.println("� �mpar!");
			}
		}
	
		
	}

}

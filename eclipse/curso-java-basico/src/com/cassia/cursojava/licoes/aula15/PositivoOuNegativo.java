package com.cassia.cursojava.licoes.aula15;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inteiro (positivo ou negativo)");
		int numero = scan.nextInt();
		
		if(numero>0) {
			System.out.println(numero + " é um número positivo");
		} else if (numero<0){
			System.out.println(numero + " é um número negativo");
		} else {
			System.out.println("0 é um número neutro!");
		}

	}

}

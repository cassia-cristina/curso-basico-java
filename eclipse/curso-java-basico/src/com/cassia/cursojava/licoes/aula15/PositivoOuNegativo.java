package com.cassia.cursojava.licoes.aula15;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n�mero inteiro (positivo ou negativo)");
		int numero = scan.nextInt();
		
		if(numero>0) {
			System.out.println(numero + " � um n�mero positivo");
		} else if (numero<0){
			System.out.println(numero + " � um n�mero negativo");
		} else {
			System.out.println("0 � um n�mero neutro!");
		}

	}

}

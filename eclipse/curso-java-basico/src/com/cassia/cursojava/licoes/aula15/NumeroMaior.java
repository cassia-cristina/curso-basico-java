package com.cassia.cursojava.licoes.aula15;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int numero2 = scan.nextInt();
		
		if(numero1>numero2) {
			System.out.println(numero1 + " é o maior número digitado.");
		} else if (numero1<numero2){
			System.out.println(numero2 + " é o maior número digitado.");
		} else 
			System.out.println("Os dois números informados são iguais");
	}

}

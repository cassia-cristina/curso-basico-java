package com.cassia.cursojava.licoes.aula15;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe outro n�mero inteiro:");
		int numero2 = scan.nextInt();
		
		if(numero1>numero2) {
			System.out.println(numero1 + " � o maior n�mero digitado.");
		} else if (numero1<numero2){
			System.out.println(numero2 + " � o maior n�mero digitado.");
		} else 
			System.out.println("Os dois n�meros informados s�o iguais");
	}

}

package com.cassia.cursojava.licoes.aula13;
import java.util.Scanner;

public class CalculoOperacoes {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int valor1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro:");
		int valor2 = scan.nextInt();
		
		System.out.println("Informe um número real:");
		double valor3 = scan.nextDouble();
		
		var calculo1 = (valor1*2) * (valor2/2);
		
		var calculo2 = (valor1*3) + valor3;
		
		var calculo3 = Math.pow(valor3, 3);		
		
		System.out.println("Produto do dobro do primeiro valor com metade do segundo valor: " + calculo1);
		
		System.out.println("Soma do triplo do primeiro valor com o terceiro valor: " + calculo2);
		
		System.out.println("Terceiro valor elevado ao cubo: " + calculo3);
				

	}

}

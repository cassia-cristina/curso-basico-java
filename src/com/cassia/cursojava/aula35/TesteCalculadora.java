package com.cassia.cursojava.aula35;
import java.util.Scanner;

public class TesteCalculadora {
	
	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Soma: " + Calculadora.somar(num1, num2));
		System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
		System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
		System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
		System.out.println("Potência: " + num1 + " elevado a " + num2 + " é " + Calculadora.potencia(num1, num2));
		
		int num3;
		
		do {
			System.out.println("Informe um número para calcular o seu fatorial:");
			num3 = scan.nextInt();
			
			if(num3<0) {
				System.out.println("Número inválido, tente novamente!");
			}
		
		} while (num3<0);
		
		System.out.println("Fatorial de " + num3 + " é: " + Calculadora.calcularFatorial(num3));
		
	}


}

package com.cassia.cursojava.aula35;
import java.util.Scanner;

public class TesteCalculadora {
	
	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo n�mero:");
		int num2 = scan.nextInt();
		
		System.out.println("Soma: " + Calculadora.somar(num1, num2));
		System.out.println("Subtra��o: " + Calculadora.subtrair(num1, num2));
		System.out.println("Multiplica��o: " + Calculadora.multiplicar(num1, num2));
		System.out.println("Divis�o: " + Calculadora.dividir(num1, num2));
		System.out.println("Pot�ncia: " + num1 + " elevado a " + num2 + " � " + Calculadora.potencia(num1, num2));
		
		int num3;
		
		do {
			System.out.println("Informe um n�mero para calcular o seu fatorial:");
			num3 = scan.nextInt();
			
			if(num3<0) {
				System.out.println("N�mero inv�lido, tente novamente!");
			}
		
		} while (num3<0);
		
		System.out.println("Fatorial de " + num3 + " �: " + Calculadora.calcularFatorial(num3));
		
	}


}

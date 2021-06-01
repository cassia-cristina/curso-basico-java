package com.cassia.cursojava.licoes.aula34;

public class Calculadora {
	
	public static int somar(int num1, int num2) {
		return num1+num2;
	}
	
	public static int subtrair(int num1, int num2) {
		return num1-num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	
	public static int dividir(int num1, int num2) {
		return num1/num2;
	}
	
	public static int potencia(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static int calcularFatorial(int num3) {
		int fatorial=1;
		for(int i=2; i<=num3; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

}

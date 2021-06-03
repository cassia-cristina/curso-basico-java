package com.cassia.cursojava.aula35;

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
		
		if(num3 == 0) {
			return 1;
		}
		
		return num3 * calcularFatorial(num3-1);
		

	}
}

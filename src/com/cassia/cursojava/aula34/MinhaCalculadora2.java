package com.cassia.cursojava.aula34;

public class MinhaCalculadora2 {
	//Variáveis e métodos estáticos

	public static int soma (int num1, int num2) {
		return num1+num2;
	}
	
	public static double soma (double num1, double num2) {
		return num1+num2;
	}
	
	public static int soma (int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	public static int soma (int[] vetor) {
		int total = 0;
		for (int v : vetor) {
			total+=v;
		}
		return total;
	}
	
}

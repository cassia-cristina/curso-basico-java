package com.cassia.cursojava.licoes.aula35;

public class Fibonacci {
	
	public static int calculaFibonacci (int num) {
		
		if(num == 0 || num == 1) {
			return num;
		}
		
		return calculaFibonacci(num-1) + calculaFibonacci(num-2);
	}

}


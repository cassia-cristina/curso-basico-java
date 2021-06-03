package com.cassia.cursojava.licoes.aula35;

public class Fibonacci {
	
	public static int calculaFibonacci (int num) {
		
		if(num < 2) {
			return 1;
		}
		
		return calculaFibonacci(num-1) + calculaFibonacci(num-2);
	}

}



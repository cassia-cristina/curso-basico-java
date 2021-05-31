package com.cassia.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora();
		
		int[] soma = new int[] {1,5,3};

		System.out.println(calc.soma(4, 6));
		
		System.out.println(calc.soma(1.5, 0.1));
		
		System.out.println(calc.soma(soma));
		
		
	}

}

package com.cassia.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora();
		
		calc.vetor = new int[3];
		
		calc.vetor[0] = 1;
		calc.vetor[1] = 5;
		calc.vetor[2] = 3;
		

		System.out.println(calc.soma(4, 6));
		
		System.out.println(calc.soma(1.5, 0.1));
		
		System.out.println(calc.soma(calc.vetor));
		
		
		
	}

}

package com.cassia.cursojava.licoes.aula34;

public class TesteCalculadora {
	
	static int[] soma;
	
	public static void main(String[] args) {

		soma = new int[] {1,5,3};

		System.out.println(MinhaCalculadora.soma(4, 6));
		
		System.out.println(MinhaCalculadora.soma(1.5, 0.1));
		
		System.out.println(MinhaCalculadora.soma(soma));
		
		
	}

}

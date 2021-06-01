package com.cassia.cursojava.aula34;

public class TesteCalculadora2 {
	
	static int[] soma;
	
	public static void main(String[] args) {

		soma = new int[] {1,5,3};

		System.out.println(MinhaCalculadora2.soma(4, 6));
		
		System.out.println(MinhaCalculadora2.soma(1.5, 0.1));
		
		System.out.println(MinhaCalculadora2.soma(soma));
		
		
	}

}

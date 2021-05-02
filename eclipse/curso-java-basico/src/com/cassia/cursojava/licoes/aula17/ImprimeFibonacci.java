package com.cassia.cursojava.licoes.aula17;

public class ImprimeFibonacci {
	
	public static void main(String[] args) {
		
				
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(proximo < 13) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
		

	}

}

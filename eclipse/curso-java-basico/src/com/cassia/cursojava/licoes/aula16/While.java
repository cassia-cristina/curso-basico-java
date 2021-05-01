package com.cassia.cursojava.licoes.aula16;

public class While {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=10) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
			
		} while (i<11);
		
		

	}

}

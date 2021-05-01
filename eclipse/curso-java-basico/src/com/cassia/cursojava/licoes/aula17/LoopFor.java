package com.cassia.cursojava.licoes.aula17;


public class LoopFor {

	public static void main(String[] args) {
		
		/*
		int i;
		
		for (i = 0; i <= 5; i++) {
			System.out.println("Valor dentro do for: " + i);
		}
		System.out.println("Após sair do for: " + i);
		
		
		int cont = 5;
		
		for (; cont > 0; cont--) {
			System.out.println("Valor dentro do for: " +cont);
		}
		
		System.out.println("Após sair do for: " + cont);
		
		
		for (int i=0, j=10; i <= j; i++, j--) {
			System.out.println("Valor de i: " + i + " - Valor de j: " + j);

		}
		
		
		for(int count = 0; count <= 10;) {
			System.out.println(count);
			count +=2;
		}
		*/
		
		int soma = 0;
		
		for (int i=1; i < 5; soma += i++);
		System.out.println(soma);
		
		int soma2 = 0;
		
		for (int i=1; i < 5; soma2 += ++i);
			System.out.println(soma2);

		
		
		
	}

}

package com.cassia.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		var resultado1 = (a == 1) && (b == 2);
		boolean resultado2 = (a == 1) && (b == 4);		
		var resultado3 = (a == 1) || (b == 5);		
		
		
		System.out.println("Valor de a � 1 AND Valor de b � 2 ? " + resultado1);
		System.out.println("Valor de a � 1 AND Valor de b � 4 ? " +resultado2);
		System.out.println("Valor de a � 1 OU Valor de b � 5 ? " +resultado3);		

	}

}

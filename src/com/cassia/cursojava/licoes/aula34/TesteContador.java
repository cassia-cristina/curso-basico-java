package com.cassia.cursojava.licoes.aula34;

public class TesteContador {

	public static void main(String[] args) {

		Contador cont = new Contador();
		
		System.out.println(cont.getContador());
		
		Contador cont2 = new Contador();
		System.out.println(cont2.getContador());
		
		cont2.zerarContador();
		System.out.println(cont2.getContador());
		
		cont2.incrementarContador(5);
		System.out.println(cont2.getContador());
		
	}

}

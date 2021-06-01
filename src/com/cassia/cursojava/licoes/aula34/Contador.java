package com.cassia.cursojava.licoes.aula34;

public class Contador {
	
	private static int contador;
	
	public Contador() {
		contador++;
	}
	
	public void zerarContador() {
		contador = 0;
	}
	
	public void incrementarContador(int incrementa) {
		contador += incrementa;
	}
	
	public int getContador() {
		return contador;
	}

}

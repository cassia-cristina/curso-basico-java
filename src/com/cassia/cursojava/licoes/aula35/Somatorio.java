package com.cassia.cursojava.licoes.aula35;

public class Somatorio {
	
	public static int calcularSomatorio(int num) {
		if(num == 1) {
			return 1;
		}
		
		return num + calcularSomatorio(num-1);
		
	}

}

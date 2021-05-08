package com.cassia.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double temp1 = 33.55;
		double temp2 = 44.55;
		double temp3 = 28.99;
		
		double[] temperaturas = new double[5];
		
		temperaturas[0] = temp1;
		temperaturas[1] = temp2;
		temperaturas[2] = temp3;
		
		System.out.println("Temperatura 2 é: " + temperaturas[1]);
		
		System.out.println(temperaturas.length);
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("Temperatura do dia " + (i+1) + " é " + temperaturas[i]);
		}
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}

}

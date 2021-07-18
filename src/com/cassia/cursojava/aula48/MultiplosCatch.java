package com.cassia.cursojava.aula48;

public class MultiplosCatch {

	public static void main(String[] args) {

		int[] vetor1 = {4, 8, 16, 32, 64 ,128};
		int[] vetor2 = {2, 0, 4, 8, 0};

		for(int i=0; i<vetor1.length; i++) {
			try {
				System.out.println(vetor1[i] + "/" + vetor2[i] + " = " + (vetor1[i]/vetor2[i]));
			}
			catch(ArithmeticException e){
				System.out.println("Impossível dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array não foi encontrada");
			}
		}

	}

}

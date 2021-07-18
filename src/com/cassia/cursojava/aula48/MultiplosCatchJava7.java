package com.cassia.cursojava.aula48;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {

		int[] vetor1 = {4, 8, 16, 32, 64 ,128};
		int[] vetor2 = {2, 0, 4, 8, 0};

		for(int i=0; i<vetor1.length; i++) {
			try {
				System.out.println(vetor1[i] + "/" + vetor2[i] + " = " + (vetor1[i]/vetor2[i]));
			}
			catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
				System.out.println("Um erro foi encontrado");
			}
		}

	}

}

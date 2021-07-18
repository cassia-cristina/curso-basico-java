package com.cassia.cursojava.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {
		
		int[] vetor1 = {4, 8, 5, 16, 32, 21, 64 ,128};
		int[] vetor2 = {2, 0, 4, 8, 0, 2, 4};

		for(int i=0; i<vetor1.length; i++) {
			try {
				if(vetor1[i] % 2 != 0) {
					throw new DivisaoNaoExata(vetor1[i], vetor2[i]);
				}
				System.out.println(vetor1[i] + "/" + vetor2[i] + " = " + (vetor1[i]/vetor2[i]));
			}
			catch(ArrayIndexOutOfBoundsException | ArithmeticException | DivisaoNaoExata e){
				System.out.println("Um erro foi encontrado");
				e.printStackTrace();
			}

		}

	}

}

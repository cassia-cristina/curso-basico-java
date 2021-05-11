package com.cassia.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {

		int[][][] matriz = new int [2][2][2];
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				for(int k=0; k<matriz[i][j].length; k++) {
					System.out.println("Valor de i: " + i + " - Valor de j: " + j + " - Valor de k: " + k);
					matriz[i][j][k] = i+j+k;
					
				}
			}
			
		} //fim do primeiro for
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				for(int k=0; k<matriz[i][j].length; k++) {
					soma += matriz[i][j][k];
					
					if(matriz[i][j][k] % 2 == 0) {
						somaPares += matriz[i][j][k];
					} else {
						somaImpares += matriz[i][j][k];
					}
					
				}
			}
			
		}// fim do primeiro for
		
		System.out.println("Soma total = " + soma);
		System.out.println("Soma pares = " + somaPares);
		System.out.println("Soma ímpares = " + somaImpares);
		
	}

}

package com.cassia.cursojava.licoes.aula20;

import java.util.Random;

public class MatrizDez {

	public static void main(String[] args) {
		
		int [][] matriz = new int[10][10];
		
		Random numeroRandom = new Random();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = numeroRandom.nextInt(10);
			}
		}
		
		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		
		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				
				if(matriz[5][j] > maiorL5) {
					maiorL5 = matriz[5][j];
				} 
				
				if(matriz[5][j] < menorL5) {
					menorL5 = matriz[5][j];
				}
				
				if(matriz[i][7] > maiorC7) {
					maiorC7 = matriz[i][7];
				} 
				
				if(matriz[i][7] < menorC7) {
					menorC7 = matriz[i][7];
				}
			}
		}	
		
		for(int i=0; i<matriz.length; i++) {
			System.out.print("Linha " + i + ": ");	
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5);
		System.out.println();
		System.out.println("Maior valor da coluna 7 = " + maiorC7);
		System.out.println("Menor valor da coluna 7 = " + menorC7);
	}

}

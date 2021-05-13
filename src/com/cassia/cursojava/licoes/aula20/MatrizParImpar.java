package com.cassia.cursojava.licoes.aula20;
import java.util.Scanner;

public class MatrizParImpar {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		int [][] matriz = new int[3][3];
		
		scan = new Scanner(System.in);
		
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println("Informe um valor para a linha " + i + " - Coluna " + j + ":");
				matriz[i][j] = scan.nextInt();
				
				if(matriz[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
				
			}
		} //fim do for
		
		
		for(int i=0; i<matriz.length; i++) {
			System.out.print("Linha " + i + ": ");			
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Quantidade de números pares: " + qtdPares);
		System.out.println("Quantidade de números ímpares: " + qtdImpares);
		
	}

}

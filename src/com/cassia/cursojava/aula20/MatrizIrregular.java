package com.cassia.cursojava.aula20;
import java.util.Scanner;

public class MatrizIrregular {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Informe o número de pessoas que serão entrevistadas:");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filhos da pessoa " + (i+1));
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				
				System.out.println("Digite o nome do filho " + (j+1));
				nomesFilhos[i][j] = scan.next();
			}
			
		} //fim do for
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i+1) + " tem " + nomesFilhos[i].length + " filho(s):");
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
			
		} //fim do for
		

	}

}

package com.cassia.cursojava.licoes.aula19;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Vetores4 {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		int[] vetorA = new int[7];
		double[] vetorB = new double[vetorA.length];
		
		//Vetor B é igual a raiz quadrada do vetor A
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A = ");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}

	}

}

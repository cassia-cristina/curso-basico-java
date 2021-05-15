package com.cassia.cursojava.aula21;
import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i=0; i<notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for(int i=0; i<notas.length; i++) {
			int nota = notas[i];
			System.out.print(nota + " ");
		}
		
		System.out.println();
		//usando for each
		
		for(int nota : notas) {
			System.out.print(nota + " ");
		}
		

	}

}

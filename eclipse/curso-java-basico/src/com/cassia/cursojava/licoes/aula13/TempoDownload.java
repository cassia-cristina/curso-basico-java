package com.cassia.cursojava.licoes.aula13;
import java.util.Scanner;

public class TempoDownload {
	
	public static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo para download em MB:");
		double tamanho = scan.nextDouble();
		
		System.out.println("Informe a velocidade da internet");
		double velocidade = scan.nextDouble();
		
		var tempo =  tamanho/velocidade;
										
		System.out.println("Tempo de download " + tempo);
			
	}
	
}
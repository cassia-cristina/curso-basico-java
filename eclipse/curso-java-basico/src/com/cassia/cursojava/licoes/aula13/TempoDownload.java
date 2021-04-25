package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TempoDownload {
	
	public static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo para download em MB:");
		double tamanho = scan.nextDouble();
		
		System.out.println("Informe a velocidade do seu link de internet em Mbps:");
		double velocidade = scan.nextDouble();
		
		var tempoEmSegundos =  tamanho/velocidade;
		
		var tempoEmMinutos = tempoEmSegundos/60;
		
		DecimalFormat df = new DecimalFormat("0.00000");
				
		System.out.println("Tempo em minutos: " + df.format(tempoEmMinutos));
	
		
	}
	
}
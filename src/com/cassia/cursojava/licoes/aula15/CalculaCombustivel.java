package com.cassia.cursojava.licoes.aula15;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaCombustivel {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Informe o total de litros:");
		double litros = scan.nextDouble();
		
		System.out.println("Informe o tipo de combustível (A-álcool ou G-gasolina):");
		String tipo = scan.next();
		
		double vlrGasolina = 2.50;
		double vlrAlcool = 1.90;
		
		double total = 0;
		int percentual = 0;
		double totalDesc = 0;
		
		if(tipo.equalsIgnoreCase("A")) {
			
			if(litros <= 20) {
				percentual = 3;
			} else {
				percentual = 5;
			} 
			
			total = litros * vlrAlcool;
						
		 } else if(tipo.equalsIgnoreCase("G")) {
			
			if(litros <= 20) {
				percentual = 4;
			} else {
				percentual = 6;
			} 
			
			total = litros * vlrGasolina;
		}

		totalDesc = (total/100) * percentual;
		double precoAPagar = total - totalDesc;
		
		System.out.println("Valor sem desconto: R$ " + df.format(total));
		System.out.println("Total de desconto: R$ " + df.format(totalDesc));
		System.out.println("Valor a ser pago: R$ " + df.format(precoAPagar));
	}

}

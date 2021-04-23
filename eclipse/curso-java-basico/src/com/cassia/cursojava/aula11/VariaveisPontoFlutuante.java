package com.cassia.cursojava.aula11;
import java.text.DecimalFormat;

public class VariaveisPontoFlutuante {
	
	public static void main (String[] args) {
	
		double valorPassagem = 123.4;
		//usando notação científica
		double valorPassagem2 = 1.234e2;
		float valorTomate = 6.17f;
		
		//Usando formatação de casas decimais
		DecimalFormat df = new DecimalFormat("#,###.00");
	
		System.out.println("Valor da passagem: " + df.format(valorPassagem));
		System.out.print("Valor da passagem: " + df.format(valorPassagem2) + "\n\r");
		System.out.println("Valor do \"kilo\" do tomate: " + valorTomate);
		
	}

}

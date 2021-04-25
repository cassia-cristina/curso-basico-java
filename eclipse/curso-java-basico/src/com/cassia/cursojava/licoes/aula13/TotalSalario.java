package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TotalSalario {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		double valor = scan.nextDouble();
		System.out.println("Qual o número de horas trabalhadas no mês?");
		double horas = scan.nextDouble();
		
		double calculo = valor*horas;
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println("Salário bruto no mês: R$ " + df.format(calculo));
		
		 

	}

}

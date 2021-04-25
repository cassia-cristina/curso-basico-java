package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TotalSalario {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora?");
		double valor = scan.nextDouble();
		System.out.println("Qual o n�mero de horas trabalhadas no m�s?");
		double horas = scan.nextDouble();
		
		double calculo = valor*horas;
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println("Sal�rio bruto no m�s: R$ " + df.format(calculo));
		
		 

	}

}

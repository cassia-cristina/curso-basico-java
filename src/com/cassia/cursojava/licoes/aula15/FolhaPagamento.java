package com.cassia.cursojava.licoes.aula15;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FolhaPagamento {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		double valorHora = scan.nextDouble();
		System.out.println("Qual o número de horas trabalhadas no mês?");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora*horas;
		int percentualIR = 0;
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		if(salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;			
		} else if (salarioBruto > 2500) {
			percentualIR = 20;
		}

		double inss = (salarioBruto/100)*10;
		double fgts = (salarioBruto/100)*11;
		double impostoRenda = (salarioBruto/100)*percentualIR;
		
		double totalDescontos = inss+impostoRenda;
		
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário Bruto: " + "(" + valorHora + " * " + horas + "): " + "R$ " + df.format(salarioBruto));
		System.out.println("(-) IR ("+ percentualIR + "%):" + " R$ " + df.format(impostoRenda));
		System.out.println("(-) INSS (10%): " + "R$ " + df.format(inss));
		System.out.println("FGTS (11%): R$ " + df.format(fgts));
		System.out.println("Total de descontos: R$ " + df.format(totalDescontos));
		System.out.println("Salário Líquido: R$ " + df.format(salarioLiquido));
	
	}

}

package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalario {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		double valor = scan.nextDouble();
		System.out.println("Qual o número de horas trabalhadas no mês?");
		double horas = scan.nextDouble();
		
		double salarioBruto = valor*horas;		
		DecimalFormat df = new DecimalFormat(".00");		
		System.out.println("Salário bruto no mês: R$ " + df.format(salarioBruto));
		
		/* + Salário Bruto: R$ - IR(11%) : R$ - INSS(8%) : R$ - Sindicato(5%) :  
		 * R$ = Salário Líquido : R$ 
		 * 
		 * Salário Bruto - Descontos = Salário Líquido
		 */
		
		double inss = (salarioBruto * 0.08);		
		System.out.println("Valor pago de INSS R$ " + df.format(inss));
		
		double sindicato = (salarioBruto * 0.05);		
		System.out.println("Valor pago de INSS R$ " + df.format(sindicato));
		
		double impostoRenda = (salarioBruto * 0.11);
		System.out.println("Valor pago de IR R$ " + df.format(impostoRenda));
		
		double descontos = inss + sindicato + impostoRenda;
		System.out.println("Total de descontos R$ " + df.format(descontos));
				
		double salarioLiquido = salarioBruto - descontos;
		System.out.println("Salário Líquido R$ " + df.format(salarioLiquido));			
		 

	}

}

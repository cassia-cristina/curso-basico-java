package com.cassia.cursojava.licoes.aula13;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalario {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora?");
		double valor = scan.nextDouble();
		System.out.println("Qual o n�mero de horas trabalhadas no m�s?");
		double horas = scan.nextDouble();
		
		double salarioBruto = valor*horas;		
		DecimalFormat df = new DecimalFormat(".00");		
		System.out.println("Sal�rio bruto no m�s: R$ " + df.format(salarioBruto));
		
		/* + Sal�rio Bruto: R$ - IR(11%) : R$ - INSS(8%) : R$ - Sindicato(5%) :  
		 * R$ = Sal�rio L�quido : R$ 
		 * 
		 * Sal�rio Bruto - Descontos = Sal�rio L�quido
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
		System.out.println("Sal�rio L�quido R$ " + df.format(salarioLiquido));			
		 

	}

}

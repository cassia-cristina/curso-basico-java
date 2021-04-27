package com.cassia.cursojava.licoes.aula15;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComReajuste {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);		
		System.out.print("Informe seu salário:");
		double salario = scan.nextDouble();
		int percentual=0;
		
		// <= 280 = + 20%
		// > 280 e <= 700 = + 15%
		// > 700 e < 1500 = + 10%
		// 1500 ou > = + 5%
		
		DecimalFormat df = new DecimalFormat(".00");
		
		if(salario <= 280) {
			percentual = 20;
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		} else if (salario >= 1500) {
			percentual = 5;
		}
		
		double reajuste = (salario/100)*percentual;
		
		double novoSalario = salario+reajuste;
		
		System.out.println("Salário anterior: R$" + df.format(salario) + " - Percentual aplicado: " + percentual + "% - Valor do reajuste: R$" + df.format(reajuste) + " - Salário com reajuste: R$" + df.format(novoSalario));
		

	}

}

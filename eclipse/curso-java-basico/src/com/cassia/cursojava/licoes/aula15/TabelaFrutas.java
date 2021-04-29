package com.cassia.cursojava.licoes.aula15;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TabelaFrutas {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade (em Kg) de morangos");
		int qtdMorangos = scan.nextInt();

		System.out.println("Informe a quantidade (em Kg) de maças");
		int qtdMacas = scan.nextInt();
		
		double precoKgMorango=0;
		if(qtdMorangos <= 5) {
			precoKgMorango = 22.50;
		} else {
			precoKgMorango = 22.20;
		}
		
		double precoKgMaca=0;
		if(qtdMacas <= 5) {
			precoKgMaca = 1.80;
		} else {
			precoKgMaca = 1.50;
		}
		
		double totalMorango = qtdMorangos * precoKgMorango;
		double totalMaca = qtdMacas * precoKgMaca;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double totalCompra = totalMorango + totalMaca;
		double desconto = 0;
		
		if((qtdMacas + qtdMorangos) > 8 || totalCompra > 25) {
			desconto = ((totalCompra /100) * 10);
			totalCompra = totalCompra - desconto;
		}
		
		System.out.println("Valor total de morangos: R$ " + df.format(totalMorango));
		System.out.println("Valor total de maças: R$ " + df.format(totalMaca));
		System.out.println("Valor de desconto: R$ " + df.format(desconto));
		System.out.println("Valor total da compra: R$ " + df.format(totalCompra));
		
		
	}

}

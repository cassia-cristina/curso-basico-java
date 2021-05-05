package com.cassia.cursojava.licoes.aula15;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PromocaoCarne {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo da cane:");
		System.out.println("1 - Filé duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Informe a quantidade (em kg):");
		double qtde = scan.nextDouble();
		double preco = 0;
		
		if(tipo == 1) {
			
			System.out.println(qtde + "kg - Filé duplo");
			
			if(qtde <= 5) {
				preco = 4.90;
			} else {
				preco = 5.80;
			}
			
		} else if (tipo == 2) {
			
			System.out.println(qtde + "kg - Alcatra");
			
			if(qtde <= 5) {
				preco = 5.90;
			} else {
				preco = 6.80;
			}
		} else if (tipo == 3) {
			
			System.out.println(qtde + "kg - Picanha");
			
			if(qtde <= 5) {
				preco = 6.90;
			} else {
				preco = 7.80;
			}
		} // fim do else
		
		double valorTotal = qtde * preco;
		
		System.out.println("Compra no cartão Tabajara? Digite 1 para sim:");
		int tipoPgto = scan.nextInt();
		
		double desconto = 0;
		double totalCompra = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		if(tipoPgto == 1) {
			desconto = (valorTotal/100)*5;
			totalCompra = valorTotal - desconto;
		} else {
			totalCompra = valorTotal;
		}
		
		System.out.println("Preço total: R$ " + df.format(valorTotal));
		System.out.println("Desconto: R$ " + df.format(desconto));
		System.out.println("Total da compra: R$ " + df.format(totalCompra));
		
		

	} // fim do metodo

} // fim da classe

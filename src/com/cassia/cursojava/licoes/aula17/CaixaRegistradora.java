package com.cassia.cursojava.licoes.aula17;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CaixaRegistradora {

	public static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		boolean sair = false;
		boolean validaPgto = false;
		String comprar;
		int qtdProdutos;
		double preco;
		double total = 0;
		String output;
		double vlrPago=0;
		double vlrTroco=0;
		
		
		do {
			
			System.out.println("Deseja informar uma nova compra? S/N");
			comprar = scan.next();
			
			if(comprar.equalsIgnoreCase("s")) {
								
				output = "Lojas Tabajara\n";
				System.out.println("Digite a qtde de produtos da compra:");
				qtdProdutos = scan.nextInt();
				
				
				for(int i=1; i<=qtdProdutos; i++) {
					System.out.println("Informe preço do produto " + i);
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + df.format(preco) + "\n";
				}
				
				output += "Total: R$ " + df.format(total) + "\n";
				
				
				System.out.println("Total dos produtos: R$ " + total);
				
				
				do {
				
					System.out.println("Informe o valor pago:");
					vlrPago = scan.nextDouble();
					
					if(vlrPago >= total) {
						validaPgto = true;
						output += "Valor pago: R$ " + df.format(vlrPago) + "\n";
						
						vlrTroco = vlrPago - total;
						
						output += "Troco: R$ " + df.format(vlrTroco) + "\n";
						
						System.out.println(output);
					} else {
						System.out.println("Valor informado é menor que o total da compra");
					}
				
				} while(!validaPgto);
				
				
			} else if (comprar.equalsIgnoreCase("n")){
					sair = true;
					
			} else {
				System.out.println("Opção inválida!");
					sair = false;
					
			}
			
		} while(!sair);
		
		

	}

}

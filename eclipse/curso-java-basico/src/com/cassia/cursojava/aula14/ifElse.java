package com.cassia.cursojava.aula14;
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}
		
		/*Produto:
		 * Se <=10 = barato
		 * 10 < valor < 15 = pedir desconto
		 * 15 <= valor 17 = pesquisar mais
		 * >= 17 = muito caro
		 */
		System.out.println("Informe o valor do produto:");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("O produto está barato!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pode pedir um desconto!");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar um pouco mais!");
		} else {
			System.out.println("O produto está muito caro!");
		}
		
		

	}

}

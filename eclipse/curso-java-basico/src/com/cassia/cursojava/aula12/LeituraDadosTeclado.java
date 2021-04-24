package com.cassia.cursojava.aula12;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.nextLine();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade: " + idade);
		
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua altura: " + altura);
		
		System.out.println("Digite seu primeiro nome, idade, estado civil, altura e se tem filhos");
		String nomeP = scan.next();
		int idad = scan.nextInt();
		String estCivil = scan.next();
		double alt = scan.nextDouble();
		boolean temFilhos = scan.nextBoolean();
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: "+ nomeP);
		System.out.println("Idade: " + idad);
		System.out.println("Estado civil: " + estCivil);
		System.out.println("Altura: " + alt);
		System.out.println("Tem filhos? " + temFilhos);
		
	}

}

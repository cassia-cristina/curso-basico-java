package com.cassia.cursojava.licoes.aula17;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidaInformacoes {
	
	public static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		boolean valida = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		DecimalFormat df = new DecimalFormat(".00");
		
		
		do {
			System.out.println("Informe seu nome:");
			nome = scan.next();
						
			if(nome.length() > 3) {
				valida = true;
			} else {
				System.out.println("Nome precisa ter mais de 3 caracteres! Nome informado: " + nome);
			}
			
		} while(!valida);
		
		valida = false;
		
		do {
			System.out.println("Informe sua idade:");
			idade = scan.nextInt();
						
			if(idade > 0 && idade <= 150) {
				valida = true;
			} else {
				System.out.println("Idade precisa ser maior que 0 e menor ou igual a 150. Idade informada: " + idade);
			}
			
		} while(!valida);
		
		valida = false;
		
		do {
			System.out.println("Informe seu salário:");
			salario = scan.nextDouble();
						
			if(salario > 0) {
				valida = true;
			} else {
				System.out.println("Salário precisa ser maior que 0! ");
			}
			
		} while(!valida);
		
		valida = false;
		
		
		do {
			System.out.println("Informe o sexo (F ou M):");
			sexo = scan.next();
						
			if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
				valida = true;
			} else {
				System.out.println("Opção inválida! Opção informada: " + sexo);
			}
			
		} while(!valida);
		
		valida = false;
		
		do {
			System.out.println("Informe seu estado civil ('S', 'C', 'V' ou 'D'):");
			estadoCivil = scan.next().toUpperCase();
						
			switch (estadoCivil) {
			case "S":
			case "C":
			case "V":
			case "D": valida = true; break;
			default: System.out.println("Opção inválida! Opção informada: " + estadoCivil);
			}
			
		} while(!valida);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + df.format(salario));
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	
	}
	
	
}
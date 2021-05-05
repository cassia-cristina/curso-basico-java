package com.cassia.cursojava.aula15;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um dia da semana (Somente letras minúsculas e sem acentos):");
		String diaSemana = scan.nextLine();
		
		switch (diaSemana) {
		case "segunda":
		case "terça":
		case "quarta":
		case "quinta":
		case "sexta": System.out.println(diaSemana + " é um dia útil"); break;
		case "sabado":
		case "domingo": System.out.println(diaSemana + " não é um dia útil"); break;
		default: System.out.println("Dia informado é inválido");
		
		}

	}

}

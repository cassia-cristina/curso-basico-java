package com.cassia.cursojava.aula15;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um dia da semana (Somente letras min�sculas e sem acentos):");
		String diaSemana = scan.nextLine();
		
		switch (diaSemana) {
		case "segunda":
		case "ter�a":
		case "quarta":
		case "quinta":
		case "sexta": System.out.println(diaSemana + " � um dia �til"); break;
		case "sabado":
		case "domingo": System.out.println(diaSemana + " n�o � um dia �til"); break;
		default: System.out.println("Dia informado � inv�lido");
		
		}

	}

}

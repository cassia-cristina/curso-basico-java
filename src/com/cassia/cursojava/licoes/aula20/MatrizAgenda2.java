package com.cassia.cursojava.licoes.aula20;
import java.util.Scanner;

public class MatrizAgenda2 {
	
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner (System.in);
		
		String[][][] compromissos = new String[12][31][9];
		
		boolean sair = false;
		boolean diaValido = false;
		boolean horaValida = false;
		boolean mesValido = false;
		byte opcao;
		
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if(opcao == 1) { //adicionar compromisso
				int mes = 0;
				mesValido = false;
				while(!mesValido) {
				System.out.println("Informe o mês (de 1 a 12):");
				mes = scan.nextInt();
				
				if(mes > 0 && mes <= 12) {
					mesValido = true;
				} else {
					System.out.println("Mês inválido, digite novamente.");
				}
				
				}//fim while				
				
				int dia = 0;
				diaValido = false;
				while(!diaValido) {
				System.out.println("Informe o dia do mês (1 a 31):");
				dia = scan.nextInt();
				
				if(dia > 0 && dia <= 31) {
					diaValido = true;
				} else {
					System.out.println("Dia inválido, digite novamente.");
				}
				
				}//fim while
				
				int hora = 0;
				horaValida = false;
				while(!horaValida) {
				System.out.println("Informe a hora (0 a 8)");
				hora = scan.nextInt();
				
				if(hora >= 0 && hora <= 8) {
					horaValida = true;
				} else {
					System.out.println("Hora inválida, digite novamente.");
				}
				
				}//fim while
				mes--;
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[mes][dia][hora] = scan.next();
				
				
			} else if(opcao == 2) { //verificar compromisso
				
				int mes = 0;
				mesValido = false;
				while(!mesValido) {
				System.out.println("Informe o mês (de 1 a 12):");
				mes = scan.nextInt();
				
				if(mes > 0 && mes <= 12) {
					mesValido = true;
				} else {
					System.out.println("Mês inválido, digite novamente.");
				}
				
				}//fim while
				
				int dia = 0;
				diaValido = false;
				while(!diaValido) {
				System.out.println("Informe o dia do mês:");
				dia = scan.nextInt();
				
				if(dia > 0 && dia <= 31) {
					diaValido = true;
				} else {
					System.out.println("Dia inválido, digite novamente.");
				}
				
				}//fim while
				
				int hora = 0;
				horaValida = false;
				while(!horaValida) {
				System.out.println("Informe a hora:");
				hora = scan.nextInt();
				
				if(hora >= 0 && hora <= 8) {
					horaValida = true;
				} else {
					System.out.println("Hora inválida, digite novamente.");
				}
				
				}//fim while
				mes--;
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[mes][dia][hora]);
				System.out.println();
				
				
			} else if(opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente!");
			}
			
			
		} //fim do while
		
	}

}

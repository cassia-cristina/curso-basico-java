package com.cassia.cursojava.licoes.aula20;
import java.util.Scanner;

public class MatrizAgenda {
	
	public static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner (System.in);
		
		String[][] compromissos = new String[31][25];
		
		boolean sair = false;
		boolean diaValido = false;
		boolean horaValida = false;
		byte opcao;
		int dia = 0;
		int hora = 0;
		
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if(opcao == 1) { //adicionar compromisso
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
				
				horaValida = false;
				while(!horaValida) {
				System.out.println("Informe a hora:");
				hora = scan.nextInt();
				
				if(hora >= 0 && hora <= 24) {
					horaValida = true;
				} else {
					System.out.println("Hora inválida, digite novamente.");
				}
				
				}//fim while
				
				dia--;
				System.out.println("Digite o compromisso:");
				compromissos[dia][hora] = scan.next(); 
				
				
			} else if(opcao == 2) { //verificar compromisso
				dia = 0;
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
				
				hora = 0;
				horaValida = false;
				while(!horaValida) {
				System.out.println("Informe a hora:");
				hora = scan.nextInt();
				
				if(hora >= 0 && hora <= 24) {
					horaValida = true;
				} else {
					System.out.println("Hora inválida, digite novamente.");
				}
				
				}//fim while
				
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[dia][hora]);
				System.out.println();
				
				
			} else if(opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente!");
			}
			
			
		} //fim do while
		
	}

}

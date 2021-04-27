package com.cassia.cursojava.licoes.aula15;
import java.util.Scanner;

public class MostraSaudacao {

	public static Scanner scan;	

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);		
		
		System.out.println("Informe M para matutino, V para vespertino ou N para noturno:");
		String turno = scan.nextLine().toUpperCase();
		
			
		 switch (turno) {
		 case "M": System.out.println("Matutino: Bom dia!"); break;
		 case "V": System.out.println("Vespertino: Boa tarde!"); break;
		 case "N": System.out.println("Noturno: Boa noite!"); break;
		 default: System.out.println("Opção inválida!");
		
		 }
		
	}

}

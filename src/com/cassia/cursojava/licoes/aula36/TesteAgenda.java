package com.cassia.cursojava.licoes.aula36;
import java.util.Scanner;

public class TesteAgenda {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.println("Informe o nome da agenda:");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		Contato [] contatos = new Contato[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("Digite as informa��es do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.println("Digite o nome:");			
			nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Digite o telefone:");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Digite o e-mail:");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
						
		}
		
		agenda.setContatos(contatos);
		
		if( agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
	}

}

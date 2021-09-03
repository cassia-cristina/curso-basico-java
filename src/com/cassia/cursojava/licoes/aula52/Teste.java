package com.cassia.cursojava.licoes.aula52;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while(opcao != 3) {
			opcao = obterOpcaoMenu(scan);
			
			if(opcao == 1) {
				consultarContato(scan, agenda);
			} else if(opcao == 2) {
				adicionarContato(scan, agenda);
			} else if(opcao ==3) {
				System.exit(0);
			}
		}
		
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Adicionando um novo contato, entre com as informações:");
		String nome = leInformacaoString(scan, "Informe o nome do contato");
		String telefone = leInformacaoString(scan, "Informe o telefone do contato");
		String email = leInformacaoString(scan, "Informe o e-mail do contato");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);
		
		System.out.println("Contato a ser criado: ");
		System.out.println(contato.toString());
		
		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da agenda:");
			System.out.println(agenda.toString());
		}
		
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = leInformacaoString(scan, "Entre com o nome do contato:");
		try {
			if(agenda.consultaContato(nomeContato) >= 0) {
				System.out.println("Contato existe!");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String leInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
		
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while(!entradaValida) {
			System.out.println("Digite a opção desejada");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");
			
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				if(opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;
				} else {
					throw new Exception ("Entrada inválida");
				}
			}
			catch(Exception e){
				System.out.println("Entrada inválida, digite novamente\n");
			}
		
		}
		return opcao;
	}

}

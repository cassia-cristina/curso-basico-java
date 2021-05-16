package com.cassia.cursojava.licoes.aula24;

public class ContatosAgenda {

	public static void main(String[] args) {

		Contato contato1 = new Contato();
		
		contato1.nome = "Fernando Crislan";
		contato1.endereco = "Av. das Laranjeiras Qd. 11 Lt. 09";
		contato1.email = "fernando09@gmail.com";		
		contato1.telefones = new String[3];		
		contato1.telefones[0] = "(61)99113-7044";
		contato1.telefones[1] = "(64)3248-5779";
		contato1.telefones[2] = "(61)99113-0004";
		
		System.out.println("Nome: " + contato1.nome);
		System.out.println("Endereço: " + contato1.endereco);
		System.out.println("E-mail: " + contato1.email);		
		System.out.println("Telefones:");
		
		for(String telefone : contato1.telefones) {
			System.out.println(telefone);
		}
		System.out.println();
		
		Contato contato2 = new Contato();
		
		contato2.nome = "Kássia Oliveira";
		contato2.endereco = "Av. das Acácias Qd. 55 Lt. 11 Setor Nova Olinda";
		contato2.email = "kassia.oliveira@gmail.com";		
		contato2.telefones = new String[3];		
		contato2.telefones[0] = "(61)98122-5541";
		contato2.telefones[1] = "(63)3258-5700";
		contato2.telefones[2] = "";
		
		System.out.println("Nome: " + contato2.nome);
		System.out.println("Endereço: " + contato2.endereco);
		System.out.println("E-mail: " + contato2.email);		
		System.out.println("Telefones:");
		
		for(String telefone : contato2.telefones) {
			System.out.println(telefone);
		}
		System.out.println();
		
		
	}

}

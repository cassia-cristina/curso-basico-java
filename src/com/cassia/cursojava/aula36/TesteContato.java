package com.cassia.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();		
		contato.setNome("Cassia");
		
		Endereco end = new Endereco();
		end.setLogradouro("Rua Londres");
		end.setNumero("N/S");
		end.setComplemento("Qd 5 Lt. 57");
		end.setCidade("Goiânia");
		end.setEstado("GO");
		end.setCep("74974-478");		
		contato.setEndereco(end);
		
		Telefone fone = new Telefone();
		fone.setDdd("062");
		fone.setTipo("Celular");
		fone.setNumero("99211-8080");
		
		Telefone fone2 = new Telefone();
		fone2.setDdd("064");
		fone2.setTipo("Comercial");
		fone2.setNumero("3548-7771");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = fone;
		telefones[1] = fone2;
		
		contato.setTelefones(telefones);
				
		System.out.println("Nome: " + contato.getNome());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println("Endereço: " + contato.getEndereco().getLogradouro());
		}
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
		
	}

}

package com.cassia.cursojava.licoes.aula43.exer02;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica("028.456.217/58", "Contribuinte 01", 1000);
		PessoaJuridica p2 = new PessoaJuridica("545.122.0001/12", "Contribuinte 02", 5000);
		PessoaFisica p3 = new PessoaFisica("123.455.211/55", "Contribuinte 03", 2000);
		PessoaJuridica p4 = new PessoaJuridica("545.122.0002/77", "Contribuinte 04", 3000);
		PessoaFisica p5 = new PessoaFisica("027.236.255/70", "Contribuinte 05", 3700);
		PessoaJuridica p6 = new PessoaJuridica("029.599.222.0001/59", "Contribuinte 06", 4000);
		
		Contribuinte[] contribuintes = new Contribuinte [6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
		
	}

}

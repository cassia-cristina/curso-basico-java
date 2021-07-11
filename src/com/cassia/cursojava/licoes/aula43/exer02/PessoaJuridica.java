package com.cassia.cursojava.licoes.aula43.exer02;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String cnpj, String nome, double rendaBruta) {
		this.cnpj = cnpj;
		super.setNome(nome);
		super.setRendaBruta(rendaBruta);
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		String s = super.toString() ;
		s += " Pessoa Juridica [CNPJ=" + cnpj + ", imposto a ser pago: " + calcularImposto() + "]";
		return s;
	}
	
}

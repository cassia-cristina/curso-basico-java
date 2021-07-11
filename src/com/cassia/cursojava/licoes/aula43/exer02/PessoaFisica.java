package com.cassia.cursojava.licoes.aula43.exer02;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica(String cpf, String nome, double rendaBruta) {
		this.cpf = cpf;
		super.setNome(nome);
		super.setRendaBruta(rendaBruta);
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		
		if(renda <= 1400) {
			return 0;
		}
		
		if(renda > 1400 && renda <=2100 ) {
			return (renda * 0.1) - 100;
		}
		
		if(renda > 2100 && renda <=2800 ) {
			return (renda * 0.15) - 270;
		}
		
		if(renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		// Maior que 3600
		return (renda * 0.3) - 700;
		
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += " Pessoa Fisica [CPF=" + cpf + ", imposto a ser pago: " + calcularImposto() + "]";
		return s;
	}

}

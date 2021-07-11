package com.cassia.cursojava.licoes.aula43.exer01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
		
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		String s="Conta Especial [";
		s += "Limite: " + limite + " ";
		s += super.toString();
		s += "]" ;
		return s;
	}
	
	public boolean sacar(double valor){
		
		double saldoComLimite = this.getSaldo() + limite;
		
		if((saldoComLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		
		if(this.getSaldo() < 0) {
			this.setLimite(this.getLimite() + this.getSaldo());
		}
		
		return false;
	}
	
}


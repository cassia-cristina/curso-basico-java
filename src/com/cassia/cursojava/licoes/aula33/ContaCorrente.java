package com.cassia.cursojava.licoes.aula33;

public class ContaCorrente {
	
	private String numero;
	private String agencia;
	private double saldo;
	private boolean especial;
	private double limiteEspecial;
	private double saldoDisponivel;
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(String numero, String agencia, double saldo, boolean especial, double limiteEspecial,
			double saldoDisponivel) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldoDisponivel = saldoDisponivel;
	}

	public ContaCorrente(String numero, String agencia) {
		this.numero = numero;
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}

	public boolean realizarSaque(double vlrASacar) {
		if(saldo >=vlrASacar) {
			saldo -= vlrASacar;
			return true;
		} else {
			if(especial) {
				double limite = limiteEspecial + saldo;
				if(limite >= vlrASacar) {
					saldo -= vlrASacar;
					return true;
				} else return false;
			} else {
				return false;
			}
		}
	}
	
	public void depositar (double vlrADepositar) {
		saldo += vlrADepositar;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}
	
	public void mostrarConta() {
		System.out.println("Conta: " + agencia + "0000" + numero);
	}
	
	public boolean verificarUsoChequeEspecial() {
		if(saldo < 0) {
			limiteEspecial += saldo;
			 return true;
		} else
			return false;
				
	}
	

}

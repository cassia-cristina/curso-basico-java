package com.cassia.cursojava.licoes.aula27;

public class ContaCorrente {
	
	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double saldoDisponivel;
	double saldoEspecialUsado;
	
	boolean realizarSaque(double vlrASacar) {
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
	} //fim do metodo
	
	void depositar (double vlrADepositar) {
		saldo += vlrADepositar;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta: " + saldo);
	}
	
	void mostrarConta() {
		System.out.println("Conta: " + agencia + "0000" + numero);
	}
	
	boolean verificarUsoChequeEspecial() {
		 return saldo < 0;
	}
	

}
package com.cassia.cursojava.licoes.aula27;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente contaBradesco = new ContaCorrente();
		
		contaBradesco.agencia = "5623";
		contaBradesco.numero = "6405-8";
		contaBradesco.limiteEspecial = 500;
		contaBradesco.especial = true;
		contaBradesco.saldo = -10;
		contaBradesco.saldoEspecialUsado = 0;
		
		contaBradesco.mostrarConta();
		contaBradesco.consultarSaldo();
		
		System.out.println("Saque no valor de R$ 10,00");
		boolean saqueEfetuado = contaBradesco.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaBradesco.consultarSaldo();
		} else {
			System.out.println("N�o foi poss�vel realizar o saque! Saldo insuficiente.");
		}
		
		System.out.println("Dep�sito no valor de R$ 500,00");
		contaBradesco.depositar(500);		
		contaBradesco.consultarSaldo();
		
		if(contaBradesco.verificarUsoChequeEspecial()) {
			System.out.println("Est� utilizando o cheque especial!");
		} else {
			System.out.println("N�o est� utilizando o cheque especial!");
		}
					
				
	}

}

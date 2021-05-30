package com.cassia.cursojava.licoes.aula33;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ContaCorrente contaBradesco = new ContaCorrente("7894", "7877");
		
		contaBradesco.setSaldo(0);
		contaBradesco.mostrarConta();
		contaBradesco.consultarSaldo();
		contaBradesco.setEspecial(true);
		contaBradesco.setLimiteEspecial(500);
		
		System.out.println("Saque no valor de R$ 10,00");
		boolean saqueEfetuado = contaBradesco.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			contaBradesco.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar o saque! Saldo insuficiente.");
		}
		
		System.out.println("Depósito no valor de R$ 1,00");
		contaBradesco.depositar(1);		
		contaBradesco.consultarSaldo();
		
		if(contaBradesco.verificarUsoChequeEspecial()) {
			System.out.println("Está utilizando o cheque especial!");
			if(contaBradesco.isEspecial()) {
				System.out.println("Limite especial atual: "+ contaBradesco.getLimiteEspecial());
			}
		} else {
			System.out.println("Não está utilizando o cheque especial!");
			if(contaBradesco.isEspecial()) {
				System.out.println("Limite especial atual: "+ contaBradesco.getLimiteEspecial());
			}
		}
		
	}

}

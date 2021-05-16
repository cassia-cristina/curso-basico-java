package com.cassia.cursojava.licoes.aula24;
import java.text.DecimalFormat;

public class ContasCorrentes {

	public static void main(String[] args) {

		ContaCorrente contaBradesco = new ContaCorrente();
		
		contaBradesco.agencia = "5623";
		contaBradesco.numero = "6405-8";
		contaBradesco.limiteEspecial = 1000;
		contaBradesco.especial = false;
		contaBradesco.saldo = 5000.55;
		contaBradesco.saldoDisponivel = contaBradesco.saldo + contaBradesco.limiteEspecial;
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		System.out.println("Conta: " + contaBradesco.agencia + "0000" + contaBradesco.numero);
		System.out.println("Saldo atual: " + df.format(contaBradesco.saldo));
		System.out.println("Cheque especial: " + df.format(contaBradesco.limiteEspecial));
		System.out.println("Saldo total disponível: " + df.format(contaBradesco.saldoDisponivel));
				
	}

}

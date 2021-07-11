package com.cassia.cursojava.licoes.aula43.exer01;

public class Teste {

	public static void main(String[] args) {
		
		//Conta Poupanca
		System.out.println("*** Teste Conta Poupança ***");
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cassia Alves");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(11);
		
		contaPoupanca.depositar(100);		
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado - Novo saldo de: R$" + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado"); 
		}
		
		System.out.println(contaPoupanca);
				
		//Conta Especial		
		System.out.println("*** Teste Conta Especial ***");
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cassia Alves");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);		
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);

	}
	
	public static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso. Novo saldo: R$" + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de R$" + valor + " - Saldo de: R$" + conta.getSaldo());
		}
	}

}

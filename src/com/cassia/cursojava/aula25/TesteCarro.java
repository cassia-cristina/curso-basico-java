package com.cassia.cursojava.aula25;

public class TesteCarro {

	public static void main(String[] args) {
		
		//Introdu��o a m�todos simples

		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia();
		double autonomia = van.obterAutonomia();
		System.out.println(van.obterAutonomia());
		
		
	}

}

package com.cassia.cursojava.aula25;

public class Carro {
	
	//Introdu??o a m?todos simples
	
	String modelo;
	String marca;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro - Modelo " + modelo + " - ?: " + capCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	
}

